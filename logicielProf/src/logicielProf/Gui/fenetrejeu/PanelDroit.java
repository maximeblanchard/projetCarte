package logicielProf.Gui.fenetrejeu;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JPanel;

import logicielProf.donnee.Carte;
import logicielProf.donnee.SuperCarte;
import logicielProf.event.DnDListener;

public class PanelDroit extends JPanel implements DnDListener
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<SuperCarte> cartes;
	private Carte<?> estSaisie;
	
	
	
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

	@Override
	public void glisser(Carte<?> e) 
	{
		// TODO Auto-generated method stub
		System.out.println("glissé !"+e.getPosAtt());
		estSaisie = e;
	}
	@Override
	public void deposer(Carte<?> e) 
	{
		// TODO Auto-generated method stub
		System.out.println("deposé !"+e.getPosAtt());
		echange(estSaisie, e);
		refresh();
	}
	
	public void echange(Carte<?> source,Carte<?> cible)
	{
		int posSource = source.getPosAtt();
		int posCible = cible.getPosAtt();
				
		cartes.remove(posSource);
		cartes.remove(posCible);
		
		cible.setPosAtt(posSource);
		source.setPosAtt(posCible);
		
		cartes.add(posSource, cible);
		cartes.add(posCible, source);

		
		System.out.println("echange : cible="+posCible+" source="+posSource);
		
		/*Object tempValSource = ((Carte)cartes.get(source.getId())).getValeur();
		System.out.println("echange");
		((Carte)cartes.get(source.getId())).setValeur(((Carte)cartes.get(cible.getId())).getValeur());
		((Carte)cartes.get(source.getId())).setValeur(tempValSource);
		*/
	}
	

}
