package it.game;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import it.oggetti.*;

public abstract class Personaggio {
	private String name;
	private int maxPuntiVita;
	private Genere sesso;
	private ArrayList<Oggetto> zaino;
	private Arma armaInMano;
	private Armatura armatura;
	
	public static String readString(String tipo) {
		Scanner scS = new Scanner(System.in);
		System.out.print("- "+tipo+":");
		return scS.nextLine();
	}
	
	public static Genere readGenere() {
		return Genere.read();
	}
	
	public abstract int attacca();
	public abstract void attaccato(int punti);
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMaxPuntiVita() {
		return maxPuntiVita;
	}


	public void setMaxPuntiVita(int maxPuntiVita) {
		this.maxPuntiVita = maxPuntiVita;
	}


	public Genere getSesso() {
		return sesso;
	}


	public void setSesso(Genere sesso) {
		this.sesso = sesso;
	}

	public Arma getArmaInMano() {
		return armaInMano;
	}

	public Armatura getArmatura() {
		return armatura;
	}

	public void addOggetto(Oggetto oggetto) {
		zaino.add(oggetto);
	}
	
	public void scegliArma() {
		Scanner sc = new Scanner(System.in);
		Stack<Arma> s = new Stack<>();
		System.out.println("Scegli un'arma");
		int i = 0;
		for(Oggetto o: zaino) {
			if(o instanceof Arma) {
				System.out.println(i+") "+((Arma) o).getNome());
				s.add((Arma) o);
				i++;
			}
		}
		this.armaInMano = (Arma) s.remove(sc.nextInt());
		while(s.size() > 0)
			zaino.add(s.pop());
	}
	
	public void scegliArmatura() {
		Scanner sc = new Scanner(System.in);
		Stack<Armatura> s = new Stack<>();
		System.out.println("Scegli un'arma");
		int i = 0;
		for(Oggetto o: zaino) {
			if(o instanceof Armatura) {
				System.out.println(i+") "+((Armatura) o).getNome());
				s.add((Armatura) o);
				i++;
			}
		}
		this.armatura = (Armatura) s.remove(sc.nextInt());
		while(s.size() > 0)
			zaino.add(s.pop());
	}
	
	public void rimettiArma() {
		zaino.add(armaInMano);
		armaInMano = null;
	}
	public void rimettiArmatura() {
		zaino.add(armatura);
		armatura = null;
	}
	
	public boolean isArmato() {
		return armaInMano!=null?true:false;
	}
	public boolean hasArmatura() {
		return armatura!=null?true:false;
	}
	
	public static enum Genere{
		M(1), F(2);
		private int genere;
		
		private Genere(int genere) {
			this.genere = genere;
		}
		
		public int getGenere() {
			return genere;
		}

		public void setGenere(int genere) {
			this.genere = genere;
		}

		public static Genere read() {
			System.out.print("- genere:");
			int i=1;
			for (Genere g: Genere.values()) {
				System.out.println((i++)+")"+g);
			}
			Scanner sc = new Scanner(System.in);
			try {
				return Genere.valueOf(sc.nextLine());
			} catch (Exception e) {
				return null;
			}
		}
	}
}
