package logicielProf.donnee;

public class SuperCarte
{
	private int posDep;
	private int posAtt;
	private int id;
	
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
