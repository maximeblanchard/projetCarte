package logicielProf.Gui;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JPanel;

import logicielProf.donnee.Carte;
import logicielProf.donnee.SuperCarte;

public class PanelDroit extends JPanel
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<SuperCarte> cartes;
	
	
	
	public PanelDroit(ArrayList<SuperCarte> nouvCartes)
	{
		
		cartes = nouvCartes;
		this.setBackground(Color.BLUE);
		//setLayout(new GridLayout(2, 10));
		
		for(int i = 0;i<cartes.size();i++)
		{
			add(new CarteAff(cartes.get(i),this));
		}
		
		
	}
	
	@SuppressWarnings("unchecked")
	public  void setCarteVal(int idCarte, Object val)
	{
		for(int i = 0;i<cartes.size();i++)
		{
			if(cartes.get(i).getId() == idCarte)
			{
				if(val instanceof Carte )
				{
					((Carte<Object>)cartes.get(i)).setValeur(val);
				}
			}
		}
		refresh();

	}
	public void refresh()
	{
		this.removeAll();
		for(int i = 0;i<cartes.size();i++)
		{
			add(new CarteAff(cartes.get(i),this));
		}
		revalidate();
		repaint();
	}
	

}
