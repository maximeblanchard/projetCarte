package logicielProf.Gui.fenetrejeu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.EventListenerList;

import logicielProf.donnee.Jeu;
import logicielProf.event.ClickListenerJeu;

public class FenetreJeu<T> extends JFrame 
{

	/**
	 * @author maxime 
	 * 
	 */
	
	//declaration variable attribut
	private static final long serialVersionUID = 1L;
	private JPanel mainPane;
	private PanelGauche panelGauche;
	private PanelDroit panelDroit;
	private JPanel panelHaut;
	private JPanel panelBas;
	private JButton envoyer;
	private final EventListenerList listeners = new EventListenerList();
	
	
	public FenetreJeu (Jeu jeu)
	{

		// init variable
		mainPane = new JPanel();
		panelDroit = new PanelDroit(jeu.getListeDeCarte());
		panelGauche = new  PanelGauche();
		panelBas = new JPanel();
		panelHaut = new JPanel();
		envoyer = new JButton("Envoyer sur les cartes");
		panelHaut.add(new JLabel("Réponse attendue"));
		
		panelBas.setLayout(new BorderLayout());
		panelBas.add(new JLabel("Message informatif"),BorderLayout.WEST);
		panelBas.add(envoyer,BorderLayout.EAST);
		envoyer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				fireBtSendClick();
				
			}
		});
		
		
		
		mainPane.setLayout(new BorderLayout());

		
		//ajout des bordures
		 
		panelGauche.setBorder(BorderFactory.createMatteBorder(0,1 , 0, 0, Color.BLACK));
		panelHaut.setBorder(BorderFactory.createLineBorder(Color.black));
		panelBas.setBorder(BorderFactory.createLineBorder(Color.black));
		JScrollPane sp = new JScrollPane(panelDroit);
		sp.setAutoscrolls(true);
		sp.setPreferredSize(new Dimension(450, 300));
		
		// ajout des panel
		mainPane.add(panelGauche,BorderLayout.WEST);
		mainPane.add(panelHaut, BorderLayout.NORTH);
		mainPane.add(sp,BorderLayout.EAST);
		mainPane.add(panelBas,BorderLayout.SOUTH);
		
		
		
		
		this.setContentPane(mainPane);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(640, 480);
		this.setVisible(true);
	}
	 public void addClickListener(ClickListenerJeu listener)
	 {
	     listeners.add(ClickListenerJeu.class, listener);
	 }
	 public ClickListenerJeu[] getClickListener()
	 {
	     return listeners.getListeners(ClickListenerJeu.class);
	 }
	 protected void fireBtSendClick()
	 {
         for(ClickListenerJeu listener : getClickListener())
         {
             listener.envoyerSurLesCarte();
         }
	 }
}
