package logicielProf;

import java.util.ArrayList;

import logicielProf.Gui.fenetrejeu.FenetreJeu;
import logicielProf.donnee.Carte;
import logicielProf.donnee.Jeu;
import logicielProf.donnee.SuperCarte;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SuperCarte> liste = new ArrayList<SuperCarte>();
		
		liste.add(new Carte<Integer>(0, 0, 1, 1));
		liste.add(new Carte<Integer>(0, 1, 2, 2));
		liste.add(new Carte<Integer>(0, 2, 3, 3));
		liste.add(new Carte<Integer>(0, 3, 4, 4));
		liste.add(new Carte<Integer>(0, 4, 5, 5));
		liste.add(new Carte<Integer>(0, 5, 6, 6));
		/*liste.add(new Carte<Integer>(0, 6, 7, 7));
		liste.add(new Carte<Integer>(0, 7, 8, 8));
		liste.add(new Carte<Integer>(0, 8, 9, 9));
		liste.add(new Carte<Integer>(0, 9, 10, 10));
		liste.add(new Carte<Integer>(0, 10, 11, 11));
		liste.add(new Carte<Integer>(0, 11, 12, 12));
		liste.add(new Carte<Integer>(0, 12, 13, 13));
		liste.add(new Carte<Integer>(0, 13, 14, 14));
		liste.add(new Carte<Integer>(0, 14, 15, 15));
		liste.add(new Carte<Integer>(0, 15, 16, 16));
		liste.add(new Carte<Integer>(0, 16, 17, 17));
		liste.add(new Carte<Integer>(0, 17, 18, 18));
		liste.add(new Carte<Integer>(0, 18, 19, 19));
		liste.add(new Carte<Integer>(0, 19, 20, 20));*/
		
	/*	
		liste.add(new Carte<Integer>(0, 20, 21, 1));
		liste.add(new Carte<Integer>(0, 21, 22, 2));
		liste.add(new Carte<Integer>(0, 22, 23, 3));
		liste.add(new Carte<Integer>(0, 23, 24, 4));
		liste.add(new Carte<Integer>(0, 24, 25, 5));
		liste.add(new Carte<Integer>(0, 25, 26, 6));
		liste.add(new Carte<Integer>(0, 26, 27, 7));
		liste.add(new Carte<Integer>(0, 27, 28, 8));
		liste.add(new Carte<Integer>(0, 28, 29, 9));
		liste.add(new Carte<Integer>(0, 29, 30, 10));
		liste.add(new Carte<Integer>(0, 30, 31, 11));
		liste.add(new Carte<Integer>(0, 31, 32, 12));
		liste.add(new Carte<Integer>(0, 32, 33, 13));
		liste.add(new Carte<Integer>(0, 33, 34, 14));
		liste.add(new Carte<Integer>(0, 34, 35, 15));
		liste.add(new Carte<Integer>(0, 35, 36, 16));
		liste.add(new Carte<Integer>(0, 36, 37, 17));
		liste.add(new Carte<Integer>(0, 37, 38, 18));
		liste.add(new Carte<Integer>(0, 38, 39, 19));
		liste.add(new Carte<Integer>(0, 39, 40, 20));
		*/
		new FenetreJeu<Integer>(new Jeu("test", 0, liste));
	}

}
