package it.main;

import it.arena.Arena;
import it.game.Orco;
import it.game.Umano;
import it.oggetti.Arma;
import it.oggetti.Armatura;

public class Main {

	public static void main(String[] args) {
		Arena arena = new Arena();
		Umano u = Umano.read();
		Orco o = Orco.read();
		Arma spada = Arma.read();
		spada.setBonus("1D6");
		Arma clava = Arma.read();
		clava.setBonus("1D8");
		Armatura armatura = Armatura.read();
		armatura.setBonus("5");
		u.addOggetto(armatura);
		u.addOggetto(spada);
		o.addOggetto(clava);
		arena.combatti(u, o);
	}

}
