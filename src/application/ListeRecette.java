package application;

import java.awt.List;
import java.awt.event.ItemListener;
import java.io.IOException;

import javafx.scene.control.ListView;


public class ListeRecette extends ListView {

	List listeRecette;
	Modele modl;
	
	public ListeRecette(ItemListener l, Modele m) throws IOException {
		
		this.modl = m;
		listeRecette = new List(20);
		for (String nomRecettes : m.recettes.keySet()) {
				listeRecette.add(nomRecettes);
		}
		this.getItems().add(listeRecette);
		listeRecette.addItemListener(l);
		listeRecette.select(0);
		
		
	}

}
