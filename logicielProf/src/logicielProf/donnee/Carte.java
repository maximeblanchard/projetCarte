package logicielProf.donnee;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

    @Override
	public String toString() {
		return "Carte [valeur2=" + valeur2 + ", posDep=" + posDep + ", posAtt="
				+ posAtt + ", id=" + id + "]";
	}
	/** Write the object to a Base64 string. */
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
        return new String(baos.toByteArray());
    }
	
}
