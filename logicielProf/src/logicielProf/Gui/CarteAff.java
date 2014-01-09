package logicielProf.Gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.TransferHandler;
import javax.swing.border.LineBorder;

import logicielProf.donnee.Carte;

public class CarteAff<T> extends JPanel
{
	/**
	 * 
	 * 
	 * 
	 * 
	 */
	
    
	private static final long serialVersionUID = 1L;
	private Carte<T> carte;
	private String val;
	private PanelDroit<T> parent;
	
	public CarteAff(Carte<T> nouvCarte,PanelDroit<T> nouvParent)
	{
		setTransferHandler(new Transfert<T>(this));
		carte = nouvCarte;
		setPreferredSize(new Dimension(50, 100));
		this.setLayout(new BorderLayout());
		this.setBorder(new LineBorder(Color.black));
		
		parent = nouvParent;
		addMouseListener(new MouseAdapter(){
	        
		     public void mousePressed(MouseEvent e)
		     {
		        System.out.println("EVENT !");
		        JComponent lab = (JComponent)e.getSource();
		        TransferHandler handle = lab.getTransferHandler();
		        handle.exportAsDrag(lab, e, TransferHandler.MOVE);
		      }
		   });
		
		
		
			val = carte.getValeur()+"";
			this.add(new JLabel(val));
		

		
		
		
	}
	public Carte<T> getCarte()
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
	public PanelDroit<T> getParent()
	{
		return parent;
	}


	
}
