package logicielProf.Gui;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * cette classe sert a gere la fenetre responsable de 
 * la configuration du jeu a savoir le type de jeu et le nombre de carte
 */
public class FenetreDeConf {
	      
	 public FenetreDeConf(){
		 JPanel pnlRecoFV;
		 
		 
		 JFrame MonFrame=new JFrame();
		 JLabel recoFVTypeLbl;
		 JLabel NbrCarteLbl;
		 JTextField NbreCartes;
		 JCheckBox check1;
		 JComboBox TypeBox;
		 JButton SuivantButton;
		 JButton TerminerlButton;
		 
		  pnlRecoFV = new JPanel() ;
		  
		  recoFVTypeLbl = new JLabel() ;
		  
		  NbrCarteLbl = new JLabel() ;
		  
		  NbreCartes= new JTextField();
		  recoFVTypeLbl.setText("Type :  ");
		  NbrCarteLbl.setText("Nombre de cartes : ");
		  
		  check1 = new JCheckBox("Autre ordre ");
		  
		  TypeBox = new JComboBox() ;
		  TypeBox.addItem("Chiffre");
		  TypeBox.addItem("Lettre");
		  TypeBox.addItem("Autre");
		 
	      SuivantButton = new JButton("Suivant ") ;
		  TerminerlButton = new JButton("Terminer") ;
		  recoFVTypeLbl.setBounds(10, 10, 50, 20);
		  TypeBox.setBounds(170,10,100,20);
		  NbrCarteLbl.setBounds(10,60,150,20);
		  NbreCartes.setBounds(170,60,100,20);
		  check1.setBounds(165,90,100,20);
		  SuivantButton.setBounds(180,150,90,20);
		  TerminerlButton.setBounds(290,150,90,20);
		  
		  pnlRecoFV.setLayout(null);
		  pnlRecoFV.add(recoFVTypeLbl);
		  pnlRecoFV.add(TypeBox);
		  pnlRecoFV.add(NbrCarteLbl);
		  pnlRecoFV.add(NbreCartes);
		  pnlRecoFV.add(check1);
		  pnlRecoFV.add(SuivantButton);
		  pnlRecoFV.add(TerminerlButton);
		  MonFrame.getContentPane().add(pnlRecoFV);
		  MonFrame.setVisible(true); 
		  MonFrame.setSize(400,250) ;
		 
		 
	 }
	
	
	

}
