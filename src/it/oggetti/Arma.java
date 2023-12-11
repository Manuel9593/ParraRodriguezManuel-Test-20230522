package it.oggetti;

import java.util.Scanner;
import it.dado.Dado;

public class Arma implements Oggetto{
	private String nome;
	private String bonus;
	
	private Arma() {}
	public static Arma read() {
		Arma a = new Arma();
		Scanner sc = new Scanner(System.in);
		System.out.print("Arma");
		System.out.print("- nome: ");
		a.setNome(sc.nextLine());
		return a;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public int getBonus() {
		return Dado.sort(bonus);
	}
	@Override
	public void setBonus(String bonus) {
		this.bonus = bonus;
	}
	
}
