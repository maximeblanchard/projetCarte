package logicielProf.Gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Accueil extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel mainPane;
	private JPanel panelG;
	private JPanel panelD;
	private JPanel panelDesc;
	
	public Accueil()
	{
		panelD = new JPanel();
		panelG = new JPanel();
		mainPane = new JPanel();
		panelDesc = new JPanel();
		
		panelD.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, Color.black));
		panelG.setPreferredSize(new Dimension(320, 100));
		panelD.setPreferredSize(new Dimension(320, 100));
		JLabel titre = new JLabel("Accueil");
		panelG.setLayout(null);
		panelG.add(titre);
		JLabel desc = new JLabel("<html>Sed cautela nimia in peiores haeserat plagas,<br/> ut narrabimus postea, aemulis<br/> consarcinantibus insidias graves<br/> apud Constantium,  cetera<br/> medium principem sed<br/> siquid auribus eius<html>");
		
		panelDesc.add(desc);
		panelDesc.setBounds(40, 120, 200, 200);
		panelG.add(panelDesc);
		titre.setBounds(100, 50, 300, 100);
		titre.setFont(new Font("arial",Font.PLAIN, 20));
		this.setResizable(false);
		JButton nouvJeu = new JButton("Nouveau Jeu");
		JButton ouvrirJeu = new JButton("Ouvrir Jeu");
		nouvJeu.setBounds(100, 100, 150, 30);
		ouvrirJeu.setBounds(100, 150, 150, 30);
		panelD.add(nouvJeu);
		panelD.add(ouvrirJeu);
		
		panelD.setLayout(null);
		
		mainPane.setLayout(new BorderLayout());
		mainPane.add(panelD,BorderLayout.EAST);
		mainPane.add(panelG,BorderLayout.WEST);
		
		
		/*
		mainPane.add(new JButton("BIENVENUE AU JEU"),BorderLayout.WEST);
		mainPane.add(new JButton("OUVRIR JEU"),BorderLayout.CENTER);
		mainPane.add(new JButton("NOUVEAU JEU"),BorderLayout.EAST);
		*/
		setContentPane(mainPane);
		
		/*for(int i=0;i<2;i++){
			if(i==0){
				mainPane.add(new JButton("OUVRIR JEU"),BorderLayout.CENTER);
			}
			else{
				mainPane.add(new JButton("    NOUVEAU JEU "),BorderLayout.EAST);	
		}
		}*/
		setTitle("ACCUEIL");
		setSize(600, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
