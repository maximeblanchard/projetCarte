package logicielProf.donnee;

public class Carte<T extends Object>
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
	public int getPosDep() {
		return posDep;
	}


	public void setPosDep(int posDep) {
		this.posDep = posDep;
	}


	public int getPosAtt() {
		return posAtt;
	}


	public void setPosAtt(int posAtt) {
		this.posAtt = posAtt;
	}


	public int getId() {
		return id;
	}


	public T getValeur() {
		return valeur;
	}

	public void setValeur(T val) {
		this.valeur = val;
	}


	public Carte(int posDep, int posAtt, int id, T valeur) {
		super();
		this.posDep = posDep;
		this.posAtt = posAtt;
		this.id = id;
		this.valeur=valeur;
	}
	
}
