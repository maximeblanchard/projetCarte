package logicielProf.Gui;



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
import logicielProf.event.DnDEvent;
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
	
		  //Nous contrôlons si les données reçues sont d'un type autorisé, ici String       
		  if (!info.isDataFlavorSupported(DataFlavor.stringFlavor)) {
		    return false;
		  }
		  return true;
	}
	public boolean importData(TransferHandler.TransferSupport support)
	{
		
		  //Nous contrôlons si les données reçues sont d'un type autorisé
		  if(!canImport(support))
		    return false;

		  //On récupère notre objet Transferable, celui qui contient les données en transit
		  Transferable data = support.getTransferable();
		  String str = "";
		  System.out.println(str);
		  try {
		    //Nous récupérons nos données en spécifiant ce que nous attendons		
		    str = (String)data.getTransferData(DataFlavor.stringFlavor);
		    
		   Carte c =  (Carte) Carte.fromString(str);
		    
		   System.out.println(c);

		  // carte.getParent().setCarteVal(carte.getCarte().getId(), carte.getCarte().getValeur());
		    carte.setVal(str);
		  } catch (UnsupportedFlavorException e){
		    e.printStackTrace();
		  } catch (IOException e) {
		    e.printStackTrace();
		  }
					
		  //Via le TRansferSupport, nous pouvons récupérer notre composant
		  JLabel lab = (JLabel)support.getComponent();
		  //Afin de lui affecter sa nouvelle valeur
		  lab.setText(str);

		  return true;
		}
	  protected void exportDone(JComponent c, Transferable t, int action)
	  {
		
		     //Une fois le drop effectué nous effaçons le contenu de notre JLabel
		      if(action == MOVE)
		    	  System.out.println("exportDone");
		  }
	  protected Transferable createTransferable(JComponent c)
	  {
		 
		     //On retourne un nouvel objet implémentant l'interface Transferable
		     //StringSelection impTlémente cette interface,  nous l'utilisons donc
		  
		  
		  //ERREUR DANS la convertion en string
		  
		 String sr =  Carte.toString(carte);
		 System.out.println("serial = "+sr);
		     return new StringSelection(sr);
		  
	  }
	  
		 public void addClickListener(DnDListener listener)
		 {
		     listeners.add(DnDListener.class, listener);
		 }
		 public DnDListener[] getClickListener()
		 {
		     return listeners.getListeners(DnDListener.class);

		     
		 }
		 protected void fireDeposer(DnDEvent e) 
		 {  
		         for(DnDListener listener : getClickListener())
		         {
		        	 listener.deposer(e);
		         }
		 }

		 protected void fireGlisser(DnDEvent e) 
		 {  
		         for(DnDListener listener : getClickListener())
		         {
		        	 listener.deposer(e);
		         }
		 }
}
