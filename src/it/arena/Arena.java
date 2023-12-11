package it.arena;

import it.game.Personaggio;

public class Arena {
	public void combatti(Personaggio p1, Personaggio p2) {
		p1.scegliArma();
		p1.scegliArmatura();
		p2.scegliArma();
		while(p1.getMaxPuntiVita() > 0 || p2.getMaxPuntiVita() > 0) {
			p1.attaccato(p2.attacca());
			p2.attaccato(p1.attacca());
		}
	}
}
