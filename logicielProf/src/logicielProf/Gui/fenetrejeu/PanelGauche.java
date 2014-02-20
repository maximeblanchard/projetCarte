 package logicielProf.Gui.fenetrejeu;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.dnd.DropTarget;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class PanelGauche extends JPanel {
	
	/**
	 * cette classe permet de gérer le panel gauche de la fenetre jeu avec 
	 * le bouton ajouter carte et la corbeil sour supprimer une carte
	 */
	private static final long serialVersionUID = 1L;

	public PanelGauche()
	{
		
		BorderLayout bLayout = new BorderLayout();
		this.setLayout(bLayout);
		this.setSize(new Dimension(300,480));
		GridLayout  gLayout = new GridLayout(2,0);
		//this.setBackground(Color.cyan);
		ImageIcon img1 =new ImageIcon("./ajouter.png");
		
		JLabel labelImg1 = new JLabel(img1);
		JPanel in = new JPanel();
		//in.setBackground(Color.red);
		in.setLayout(gLayout);
		in.add(labelImg1);
		this.add(BorderLayout.NORTH,in);

	
		
		ImageIcon img2 =  new ImageIcon("./corbeille.png");
		JLabel labelImg2 = new JLabel(img2);
		labelImg1.setDropTarget(new DropTarget());
		this.add(labelImg2);
		this.add(BorderLayout.SOUTH,labelImg2);
		
		

		
	}
		

}
