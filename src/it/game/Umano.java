package it.game;

import it.dado.Dado;

public class Umano extends Personaggio {
	private Umano() {}
	public static Umano read() {
		Umano u = new Umano();
		u.setName(Umano.readString("nome"));
		u.setSesso(Umano.readGenere());
		u.setMaxPuntiVita(10+Dado.sort(2,20));
		return u;
	}
	
	@Override
	public int attacca() {
		if(isArmato()) {
			return getArmaInMano().getBonus();
		}
		return 0;
	}

	@Override
	public void attaccato(int punti) {
		if(hasArmatura()) {
			this.setMaxPuntiVita(punti-getArmatura().getBonus());
		} else {
			this.setMaxPuntiVita(punti);
		}
	}

}
