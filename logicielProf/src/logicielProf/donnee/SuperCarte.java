package logicielProf.donnee;

/**
 * Cette classe est une classe générique de Carte<T> en effet on peut stocker tout
 * type de cartes dans cette classe 
 * @author maxime
 *
 */
public class SuperCarte
{
	protected int posDep;
	protected int posAtt;
	protected int id;
	
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





	public SuperCarte(int posDep, int posAtt, int id) 
	{
		
		this.posDep = posDep;
		this.posAtt = posAtt;
		this.id = id;
	}
	
}
