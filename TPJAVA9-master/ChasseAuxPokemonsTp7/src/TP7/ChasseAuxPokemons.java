package TP7;
import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
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

	public static void main(String[] args) throws FileNotFoundException {
		HashMap<String, Attaque> ListAttaques=new HashMap<String,Attaque>();
		
		ArrayList<Pokemon> listPokemon = new ArrayList<Pokemon>();
		ListAttaques.put("tackle", new AttaqueTackle());
		  
		ArrayList<String> liste_fich = new ArrayList<>(); 
            	
            try (java.util.Scanner scan = new java.util.Scanner(new FileReader("text.txt"))) {
            	
                while (scan.hasNextLine()) {
                    String[] mots = scan.nextLine().split("END");
                   
                    for(int i=0;i<mots.length;i++)
                    {
                    	 System.out.println(mots[i]);
                    }
                }
            }
        }
	
}
