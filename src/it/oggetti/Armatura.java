package it.oggetti;

import java.util.Scanner;

public class Armatura implements Oggetto{
	private String nome;
	private String bonus;
	
	private Armatura() {}
	public static Armatura read() {
		Armatura a = new Armatura();
		Scanner sc = new Scanner(System.in);
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
		return Integer.parseInt(bonus);
	}
	@Override
	public void setBonus(String bonus) {
		this.bonus = bonus;
	}
	
}
