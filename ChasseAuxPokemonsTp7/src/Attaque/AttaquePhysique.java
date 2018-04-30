package Attaque;

import TP7.Pokemon;

public class AttaquePhysique extends Attaque {

	@Override
	public AttaquePhysique genAttaque() {
		return new AttaquePhysique(getNom(), getPuissance(), getPrecision(), getRepetition());
	}

	public AttaquePhysique(String nom, int puissance, int precision, int repetitionsAttaque) {
		super(nom, puissance, precision, repetitionsAttaque);
	}
	
	public boolean estCompatible(Pokemon p) {
		return true;
	}
	
	@Override
	public void utiliser(Pokemon attaquant, Pokemon victime) {
		// premierement on verifie si le score d'attaque de l'attaquant est superieur a la defence de la victime
		// puis on v�rifie si la precision indique un succes
		
		if(this.getRepetitionRest()>0 && attaquant.getAttack() > victime.getDefense() && Math.random()*100 < this.getPrecision()) {
			victime.estBlesse(this.getPuissance()/4);
			this.baisseRepetitions();
			System.out.println("L'attaque est r�ussie, elle cause un dommage de " + this.getPuissance()/4);
		}
		else {
			if (this.getRepetitionRest() <= 0) {
				System.out.println("Pas assez de r�p�titions.");
			}
			else {
				System.out.println("Votre attaque n'a pas fonctionn�e.");
				this.baisseRepetitions();
			}
		}
		
	}

}
