package logicielProf.Gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.TransferHandler;
import javax.swing.border.LineBorder;

import logicielProf.donnee.Carte;
import logicielProf.donnee.SuperCarte;

public class CarteAff extends JPanel
{
	/**
	 * 
	 * 
	 * 
	 * 
	 */
	
    
	private static final long serialVersionUID = 1L;
	private SuperCarte carte;
	private String val;
	private PanelDroit parent;
	
	@SuppressWarnings("rawtypes")
	public CarteAff(SuperCarte nouvCarte,PanelDroit nouvParent)
	{
		// on set le transfer handler
		setTransferHandler(new Transfert(this));
		
		carte = nouvCarte;
		setPreferredSize(new Dimension(50, 100));
		this.setLayout(new BorderLayout());
		this.setBorder(new LineBorder(Color.black));
		
		parent = nouvParent;
		
		
		this.addMouseListener(new MouseAdapter(){
	        
		     public void mousePressed(MouseEvent e)
		     {
		    	// on recupère la source de l'envent
		        CarteAff cible = (CarteAff)e.getSource();
		        
		        // on rècupère le transferhanlder
		        TransferHandler handle = cible.getTransferHandler();
		        
		        
		        handle.exportAsDrag(cible, e, TransferHandler.MOVE);
		      }
		   });
		
		
			if(carte instanceof Carte)
			{
				val = ((Carte)carte).getValeur()+"";
			}
			
			this.add(new JLabel(val));
		

		
		
		
	}
	public SuperCarte getCarte()
	{
		return carte;
	}
	public String getVal()
	{
		return val;
	}
	public void setVal(String nouvVal)
	{
		val = nouvVal;
		this.removeAll();
		this.add(new JLabel(val));
		repaint();
		revalidate();
	}
	public PanelDroit getParent()
	{
		return parent;
	}


	
}
