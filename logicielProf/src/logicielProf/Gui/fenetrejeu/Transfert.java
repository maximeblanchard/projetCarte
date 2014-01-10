package logicielProf.Gui.fenetrejeu;



import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.TransferHandler;
import javax.swing.event.EventListenerList;

import logicielProf.donnee.Carte;
import logicielProf.event.DnDListener;

public class Transfert extends TransferHandler 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final EventListenerList listeners = new EventListenerList();
	private CarteAff carte;
	
	public Transfert(CarteAff nouvC)
	{
		carte= nouvC;
	}
	public int getSourceActions(JComponent c) 
	{
		
		  return MOVE;
	}
	public boolean canImport(TransferHandler.TransferSupport info) 
	{
	
		  //Nous contr�lons si les donn�es re�ues sont d'un type autoris�, ici String       
		  if (!info.isDataFlavorSupported(DataFlavor.stringFlavor)) {
		    return false;
		  }
		  return true;
	}
	public boolean importData(TransferHandler.TransferSupport support)
	{
		
		  //Nous contr�lons si les donn�es re�ues sont d'un type autoris�
		  if(!canImport(support))
		    return false;

		  //On r�cup�re notre objet Transferable, celui qui contient les donn�es en transit
		  Transferable data = support.getTransferable();
		  String str = "";
		  System.out.println(str);
		  try {
		    //Nous r�cup�rons nos donn�es en sp�cifiant ce que nous attendons		
		    str = (String)data.getTransferData(DataFlavor.stringFlavor);
		    fireDeposer((Carte)carte.getCarte());

		  } catch (UnsupportedFlavorException e){
		    e.printStackTrace();
		  } catch (IOException e) {
		    e.printStackTrace();
		  }
					
		  //Via le TRansferSupport, nous pouvons r�cup�rer notre composant
		  JLabel lab = (JLabel)support.getComponent();
		  //Afin de lui affecter sa nouvelle valeur
		  lab.setText(str);

		  return true;
		}
	  protected void exportDone(JComponent c, Transferable t, int action)
	  {
		
		     //Une fois le drop effectu� nous effa�ons le contenu de notre JLabel
		      if(action == MOVE)
		    	  System.out.println("exportDone");
		  }
	  protected Transferable createTransferable(JComponent c)
	  {
		 
		     //On retourne un nouvel objet impl�mentant l'interface Transferable
		     //StringSelection impTl�mente cette interface,  nous l'utilisons donc
		  
		  
		  //ERREUR DANS la convertion en string
		  
		 //String sr =  CarteAff.toString(carte);
		// System.out.println("serial = "+sr+"fin ser\n\n");
		 fireGlisser((Carte)carte.getCarte());
		     return new StringSelection("f");
		  
	  }
	  
		 public void addDnDListener(DnDListener listener)
		 {
		     listeners.add(DnDListener.class, listener);
		 }
		 public DnDListener[] getDnDListener()
		 {
		     return listeners.getListeners(DnDListener.class);

		     
		 }
		 protected void fireDeposer(Carte e) 
		 {  
		         for(DnDListener listener : getDnDListener())
		         {
		        	 listener.deposer(e);
		         }
		 }

		 protected void fireGlisser(Carte e) 
		 {  
		         for(DnDListener listener : getDnDListener())
		         {
		        	 listener.glisser(e);
		         }
		 }
}
