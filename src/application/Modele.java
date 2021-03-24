package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Observable;

public class Modele extends Observable { 

	public HashMap<String, List<String>> recettes;
	FileReader fr;
	BufferedReader br;
	String nomRecetteSelec = "flan de courgette";

	public Modele() throws IOException {
		
		this.fr = new FileReader(new File("donnees.csv"));
        this.br = new BufferedReader(fr);
		this.recettes = new HashMap<String, List<String>>();
		for (String line = br.readLine(); line != null; line = br.readLine()) {
            String[] parts = line.split(";");
            String id = parts[0];
            String categorie = parts[1];
            String[] ingredients = parts[2].split(",");
            ArrayList<String> listeIngredients = new ArrayList<>();
            for (String i : ingredients) {
            	listeIngredients.add(i);
            }
            recettes.put(id, listeIngredients);
		}
	}
}
