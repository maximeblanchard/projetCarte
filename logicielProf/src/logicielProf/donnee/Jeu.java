package logicielProf.donnee;

import java.util.ArrayList;

public class Jeu
{
	private String nom;
	private int id;
	private ArrayList<SuperCarte> listeDeCarte;
	
	public Jeu(String nom, int id, ArrayList<SuperCarte> listeDeCarte) 
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

	public ArrayList<SuperCarte> getListeDeCarte() {
		return listeDeCarte;
	}
	
	
	
	
}
