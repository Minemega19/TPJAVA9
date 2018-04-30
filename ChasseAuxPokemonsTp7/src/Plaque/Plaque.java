package Plaque;

import Item.ItemEquipable;
import TP7.Pokemon;

public abstract class Plaque extends ItemEquipable {

	private String type;
	private static int pourcentageEnplus=10;
	
	public Plaque(String nom, int frequence,String type) {
		super(nom, frequence);
		this.type=type;

	}
	public boolean estCompatible(Pokemon p ){
		boolean estCompatible = false;
		try{
			if(p.getType()==this.type)
				estCompatible=true;
		}catch (NullPointerException e) {
		}
		return estCompatible;
	}
	
	public String getType() {
		return type;
	}

	@Override
	public void equipe(Pokemon p) {
		if (this.estCompatible(p))
			super.equipe(p);
		else
			System.out.println("Pokemon non compatible");
	}
	@Override
	public void setPokemonEquipe(Pokemon pokemonEquipe) {
		if (this.estCompatible(pokemonEquipe))
			super.setPokemonEquipe(pokemonEquipe);
		else
			System.out.println("Pokemon non Compatible");
	}
	public void setType(String type) {
		this.type = type;
	}

	public static int getPourcentageEnplus() {
		return pourcentageEnplus;
	}

	public static void setPourcentageEnplus(int pourcentageEnplus) {
		Plaque.pourcentageEnplus = pourcentageEnplus;
	}



}
