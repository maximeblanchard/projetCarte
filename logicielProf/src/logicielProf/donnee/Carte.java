package logicielProf.donnee;

import java.io.Serializable;

public class Carte<T extends Object> extends SuperCarte implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private T valeur2;
	
	/**
	 * 
	 * GetPosDep
	 * @return
	 */



	public T getValeur() {
		return valeur2;
	}
	public void setValeur(T val) 
	{
		this.valeur2 = val;
	}


	public Carte(int posDep, int posAtt, int id, T valeur) {
		super(posDep,posAtt,id);

		this.valeur2=valeur;
	}
    /** Read the object from Base64 string. 
     * @throws  */


    @Override
	public String toString() {
		return "Carte [valeur2=" + valeur2 + ", posDep=" + posDep + ", posAtt="
				+ posAtt + ", id=" + id + "]";
	}
	/** Write the object to a Base64 string. */

	
}
