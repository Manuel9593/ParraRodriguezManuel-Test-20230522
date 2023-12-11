package it.dado;

public class Dado {
	public static int sort(int numeroDadi, int numeroFacce) {
		int ris=0;
		for(int i = 0; i < numeroDadi; i++) {
			ris += (int) (Math.random()*(numeroFacce-1))+1;
		}
		return ris;
	}
	public static int sort(String s) {
		String[] ar = s.split("D"); int ris = 0;
		for(int i = 0; i < Integer.parseInt(ar[0]); i++) {
			ris += (int) (Math.random()*(Integer.parseInt(ar[1])-1))+1;
		}
		return ris;
	}
}
