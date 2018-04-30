package TP7;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.sun.java_cup.internal.runtime.Scanner;

import Attaque.Attaque;
import Attaque.AttaqueBulle;
import Attaque.AttaqueCoupDeTete;
import Attaque.AttaqueEnfer;
import Attaque.AttaqueFeinte;
import Attaque.AttaqueMorsure;
import Attaque.AttaquePistoleEau;
import Attaque.AttaqueTackle;
import Attaque.AttaqueTornadeFeuilles;
import Item.Item;
import Item.ItemEquipable;
import Item.ItemVetement;

public class ChasseAuxPokemons {

	public static void main(String[] args) {
		HashMap<String, Attaque> ListAttaques=new HashMap<String,Attaque>();
		
		ArrayList<Pokemon> listPokemon = new ArrayList<Pokemon>();
		ListAttaques.put("tackle", new AttaqueTackle());
		
		String filePath = "text.txt";
		 
		try{

		BufferedReader buff = new BufferedReader(new FileReader(filePath));
		 
		try {
		String line;
		while ((line = buff.readLine()) != null) {
		System.out.println(line);
		}
		} finally {
		// dans tous les cas, on ferme nos flux
		buff.close();
		}
		} catch (IOException ioe) {
		// erreur de fermeture des flux
		System.out.println("Erreur --" + ioe.toString());
		}
		
		
	}
}
