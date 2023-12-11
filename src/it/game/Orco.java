package it.game;

import it.dado.Dado;

public class Orco extends Personaggio {
	public boolean cieco = false;
	private Orco() {}
	public static Orco read() {
		Orco o = new Orco();
		o.setName(Orco.readString("nome"));
		o.setSesso(Orco.readGenere());
		o.setMaxPuntiVita(10+Dado.sort(1,20));
		return o;
	}
	
	public boolean isCieco() {
		return cieco;
	}
	public void setCieco(boolean cieco) {
		this.cieco = cieco;
	}
	@Override
	public int attacca() {
		if(isArmato()) {
			if(isCieco()) {
				return (int)(Math.round(Math.random()))==1?getArmaInMano().getBonus():0;
			}
			return getArmaInMano().getBonus();
		}
		return 0;
	}

	@Override
	public void attaccato(int punti) {
		// TODO Auto-generated method stub
		
	}
	
}
