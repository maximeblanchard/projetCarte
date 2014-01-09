package logicielProf;

import java.util.ArrayList;

import logicielProf.Gui.FenetreJeu;
import logicielProf.donnee.Carte;
import logicielProf.donnee.Jeu;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Carte<Integer>> liste = new ArrayList<Carte<Integer>>();
		
		liste.add(new Carte<Integer>(0, 0, 1, 1));
		liste.add(new Carte<Integer>(0, 0, 2, 2));
		liste.add(new Carte<Integer>(0, 0, 3, 3));
		liste.add(new Carte<Integer>(0, 0, 4, 4));
		liste.add(new Carte<Integer>(0, 0, 5, 5));
		liste.add(new Carte<Integer>(0, 0, 6, 6));
		liste.add(new Carte<Integer>(0, 0, 7, 7));
		liste.add(new Carte<Integer>(0, 0, 8, 8));
		liste.add(new Carte<Integer>(0, 0, 9, 9));
		liste.add(new Carte<Integer>(0, 0, 10, 10));
		liste.add(new Carte<Integer>(0, 0, 11, 11));
		liste.add(new Carte<Integer>(0, 0, 12, 12));
		liste.add(new Carte<Integer>(0, 0, 13, 13));
		liste.add(new Carte<Integer>(0, 0, 14, 14));
		liste.add(new Carte<Integer>(0, 0, 15, 15));
		liste.add(new Carte<Integer>(0, 0, 16, 16));
		liste.add(new Carte<Integer>(0, 0, 17, 17));
		liste.add(new Carte<Integer>(0, 0, 18, 18));
		liste.add(new Carte<Integer>(0, 0, 19, 19));
		liste.add(new Carte<Integer>(0, 0, 20, 20));
		
		
		liste.add(new Carte<Integer>(0, 0, 21, 1));
		liste.add(new Carte<Integer>(0, 0, 22, 2));
		liste.add(new Carte<Integer>(0, 0, 23, 3));
		liste.add(new Carte<Integer>(0, 0, 24, 4));
		liste.add(new Carte<Integer>(0, 0, 25, 5));
		liste.add(new Carte<Integer>(0, 0, 26, 6));
		liste.add(new Carte<Integer>(0, 0, 27, 7));
		liste.add(new Carte<Integer>(0, 0, 28, 8));
		liste.add(new Carte<Integer>(0, 0, 29, 9));
		liste.add(new Carte<Integer>(0, 0, 30, 10));
		liste.add(new Carte<Integer>(0, 0, 31, 11));
		liste.add(new Carte<Integer>(0, 0, 32, 12));
		liste.add(new Carte<Integer>(0, 0, 33, 13));
		liste.add(new Carte<Integer>(0, 0, 34, 14));
		liste.add(new Carte<Integer>(0, 0, 35, 15));
		liste.add(new Carte<Integer>(0, 0, 36, 16));
		liste.add(new Carte<Integer>(0, 0, 37, 17));
		liste.add(new Carte<Integer>(0, 0, 38, 18));
		liste.add(new Carte<Integer>(0, 0, 39, 19));
		liste.add(new Carte<Integer>(0, 0, 40, 20));
		new FenetreJeu<Integer>(new Jeu<Integer>("test", 0, liste));
	}

}
