package logicielProf.Gui.fenetrejeu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

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
		Transfert th = new Transfert(this);
		
		setTransferHandler(th);
		
		
		carte = nouvCarte;
		setPreferredSize(new Dimension(50, 100));
		this.setLayout(new BorderLayout());
		this.setBorder(new LineBorder(Color.black));
		
		parent = nouvParent;
		th.addDnDListener(parent);
		
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
			setLayout(new BorderLayout());
			JLabel label = new JLabel(val,JLabel.CENTER);
			label.setFont(new Font("arial", Font.BOLD, 20));
			label.setPreferredSize(new Dimension(30,30));
			label.setHorizontalTextPosition(JLabel.CENTER);
			this.add(label,BorderLayout.CENTER);
		

		
		
		
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
    public static String toString( Serializable o )
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos;
		try 
		{
			oos = new ObjectOutputStream( baos );
	        oos.writeObject( o );        
	        oos.close();
		}
        catch (IOException e)
        {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String res = new String(baos.toByteArray());
		try {
			baos.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return res;
    }
    public static Object fromString( String s )  
    {
        byte [] data = s.getBytes();
        ObjectInputStream ois;
        Object o = null;
		try 
		{
			
		ois = new ObjectInputStream(  new ByteArrayInputStream(  data ) );
         o  = ois.readObject();
        ois.close();
		
		} 
		catch ( IOException | ClassNotFoundException  e) 
		{
			// TODO Auto-generated catch block
			System.out.println("ci");
			e.printStackTrace();
		}
        return  o;
    }


	
}
