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

import org.w3c.dom.events.Event;
import org.w3c.dom.events.EventListener;

import logicielProf.event.DnDEvent;
import logicielProf.event.DnDListener;

public class Transfert<T> extends TransferHandler implements EventListener
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final EventListenerList listeners = new EventListenerList();
	private CarteAff<T> carte;
	
	public Transfert(CarteAff<T> nouvC)
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

		  try {
		    //Nous r�cup�rons nos donn�es en sp�cifiant ce que nous attendons		
		    str = (String)data.getTransferData(DataFlavor.stringFlavor);
		    //System.out.println("recu "+str);
		    String[] param = str.split(":");
		    
		   System.out.println("old val : "+ param[0]+" id carte"+param[1]);
		   carte.getParent().setCarteVal(Integer.parseInt(param[1]), (T)param[0]);

		   carte.getParent().setCarteVal(carte.getCarte().getId(), carte.getCarte().getValeur());
		    carte.setVal(str);
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
		     return new StringSelection(carte.getVal()+":"+carte.getCarte().getId());
	  }
	  
		 public void addClickListener(DnDListener listener)
		 {
		     listeners.add(DnDListener.class, listener);
		 }
		 public DnDListener[] getClickListener()
		 {
		     return listeners.getListeners(DnDListener.class);

		     
		 }
		 protected void fireAchatDeFactory(String name) 
		 {  
		         for(DnDListener listener : getClickListener())
		         {
		        	 listener.deposer(new DnDEvent(null, null));
		         }
		 }
	@Override
	public void handleEvent(Event evt) {
		// TODO Auto-generated method stub
		
	}

}
