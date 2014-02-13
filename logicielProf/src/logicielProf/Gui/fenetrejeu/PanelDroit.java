package logicielProf.Gui.fenetrejeu;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import sun.awt.image.ImageAccessException;
import logicielProf.donnee.Carte;
import logicielProf.donnee.SuperCarte;
import logicielProf.event.DnDListener;

public class PanelDroit extends JPanel implements DnDListener
{

	/**
	 * sfgdgfdtsfg,ft
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<SuperCarte> cartes;
	private Carte<?> estSaisie;
	private Boolean curEstCarte = false;



	public PanelDroit(ArrayList<SuperCarte> nouvCartes)
	{

		cartes = nouvCartes;
		//this.setBackground(Color.BLUE);
		//setLayout(new GridLayout(2, 10));

		for(int i = 0;i<cartes.size();i++)
		{
			add(new CarteAff(cartes.get(i),this));
		}
		
		addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent arg0) {
				// TODO Auto-generated method stub


			}
			
			@Override
			public void mouseDragged(MouseEvent arg0) {
				// TODO Auto-generated method stub
	
					System.out.println("ici");
					Toolkit tk = Toolkit.getDefaultToolkit();
					 Image img = tk.getImage("carte.png");
					Cursor monCurseur = tk.createCustomCursor(img, new Point(0, 0), "mon oeil");
				
					setCursor(monCurseur);			
			}
		});


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
		curEstCarte = true;
		System.err.println("glissé ! camillia"+e.getPosAtt());
		Toolkit tk = Toolkit.getDefaultToolkit();
		 Image img = tk.getImage("carte.png");
		Cursor monCurseur = tk.createCustomCursor(img, new Point(0, 0), "mon oeil");
		setCursor(monCurseur);
		estSaisie = e;
	}
	@Override
	public void deposer(Carte<?> e) 
	{
		// TODO Auto-generated method stub
		curEstCarte = false;
		Cursor monCurseu = Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR);
		setCursor(monCurseu);
		System.err.println("deposé !"+e.getPosAtt());
		echange(estSaisie, e);
		refresh();
	}
	/**  echange 1 et 3 
	 * 
	 * 
	 * e
	 * 
	 * 
	 * **/
	public void echange(Carte<?> source,Carte<?> cible)
	{

		
		
		int posSource = source.getPosAtt();
		int posCible = cible.getPosAtt();
		//System.err.println("echange : cible="+cartes.get(posCible)+" source="+cartes.get(posSource));

		//System.err.println(" data "+ source.getId()+" "+source.getPosAtt()+"et  "+cible.getId()+" "+cible.getPosAtt());
		//System.err.println("CARTEAPRES : cible="+cartes.get(posCible+1)+" source="+cartes.get(posSource));

		//EAPRES : cible="+cartes.get(posCible+1)+" source="+cartes.get(posSource));

		cible.setPosAtt(posSource);
		source.setPosAtt(posCible);
		
		cartes.set(posSource, cible);
		cartes.set(posCible, source);
		//System.err.println("echange : cible="+cible.getId()+" "+posSource+" source="+source.getId()+" "+posCible);


		

		//System.err.println("CARTEAPRESAJOUT : cible="+cartes.get(posCible+1)+" source="+cartes.get(posSource));

		//System.err.println("echange : cible="+cartes.get(posCible)+" source="+cartes.get(posSource));
																																													
		/*Object tempValSource = ((Carte)cartes.get(source.getId())).getValeur();
		System.out.println("echange");
		((Carte)cartes.get(source.getId())).setValeur(((Carte)cartes.get(cible.getId())).getValeur());
		((Carte)cartes.get(source.getId())).setValeur(tempValSource);
		 */
	}


}
