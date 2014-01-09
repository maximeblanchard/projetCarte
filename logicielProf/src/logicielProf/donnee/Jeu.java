package logicielProf.donnee;

import java.util.ArrayList;

public class Jeu<T>
{
	private String nom;
	private int id;
	private ArrayList<Carte<T>> listeDeCarte;
	
	public Jeu(String nom, int id, ArrayList<Carte<T>> listeDeCarte) 
	{
		
		this.nom = nom;
		this.id = id;
		this.listeDeCarte = listeDeCarte;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public ArrayList<Carte<T>> getListeDeCarte() {
		return listeDeCarte;
	}
	
	
	
	
}
