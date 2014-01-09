package logicielProf.donnee;

public class Carte<T extends Object> extends SuperCarte
{
	private int posDep;
	private int posAtt;
	private int id;
	private T valeur;
	
	/**
	 * 
	 * GetPosDep
	 * @return
	 */



	public T getValeur() {
		return valeur;
	}

	public void setValeur(T val) {
		this.valeur = val;
	}


	public Carte(int posDep, int posAtt, int id, T valeur) {
		super(posDep,posAtt,id);

		this.valeur=valeur;
	}
	
}
