package Attaque;

import TP7.Pokemon;

public class AttaqueSpeciale extends Attaque {

	public AttaqueSpeciale(String nom, String[] typesCompatibles, int puissance, int precision, int repetitionsAttaque) {
		super(nom, typesCompatibles, puissance, precision, repetitionsAttaque);
	}
	
	public boolean estCompatible(Pokemon p) {
		for(int i = 0; i < this.getTypeCompatible().length; i++) {
			if (p.getType().equals(this.getTypeCompatible()[i])) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void utiliser(Pokemon attaquant, Pokemon victime) {
		
		// Dans la classe Pokemon, on verifie deja la compatibilite entre le type de l'attaque et le type du pokemon
		
		// Si la victime est compatible, alors il faut prendre en compte son score defenseSpeciale; sinon il faut considerer juste la defense
		int scoreDefense = victime.getSpeDefense();
		if (! this.estCompatible(victime)) {
			scoreDefense = victime.getDefense();
		}
		
		// On verifie si le score d'attaque de l'attaquant est superieur a la defence de la victime
		// puis on v�rifie si la precision indique un succes
		
		if(this.getRepetitionRest() > 0 && attaquant.getSpeAttack() > scoreDefense && Math.random()*100 < this.getPrecision()) {
			victime.estBlesse(this.getPuissance()/4);
			this.baisseRepetitions();
			System.out.println("L'attaque est r�ussie, il cause un dommage de " + this.getPuissance()/4);
		}
		else {
			if (this.getRepetitionRest()<=0) {
				System.out.println("Pas assez de r�p�titions.");
			}
			else {
				System.out.println("Votre attaque n'a pas fonctionn�e.");
				this.baisseRepetitions();
			}
		}
	}


}
