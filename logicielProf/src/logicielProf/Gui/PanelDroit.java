package logicielProf.Gui;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JPanel;

import logicielProf.donnee.Carte;

public class PanelDroit<T> extends JPanel
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Carte<T>> cartes;
	
	
	
	public PanelDroit(ArrayList<Carte<T>> nouvCartes)
	{
		
		cartes = nouvCartes;
		this.setBackground(Color.BLUE);
		//setLayout(new GridLayout(2, 10));
		
		for(int i = 0;i<cartes.size();i++)
		{
			add(new CarteAff<T>(cartes.get(i),this));
		}
		
		
	}
	
	public  void setCarteVal(int idCarte, T val)
	{
		for(int i = 0;i<cartes.size();i++)
		{
			if(cartes.get(i).getId() == idCarte)
			{
				cartes.get(i).setValeur(val);
			}
		}
		refresh();

	}
	public void refresh()
	{
		this.removeAll();
		for(int i = 0;i<cartes.size();i++)
		{
			add(new CarteAff<T>(cartes.get(i),this));
		}
		revalidate();
		repaint();
	}
	

}
