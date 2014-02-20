package logicielProf.donnee;

import java.util.ArrayList;
/**
 * la classe jeu permet de sauvegarer tout les parammetre du jeu actuelle 
 * la liste des carten et le nom du jeu 
 * @author maxime
 *
 */
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
