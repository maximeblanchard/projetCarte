package logicielProf.event;

import logicielProf.donnee.Carte;

public class DnDEvent<T>
{

	public Carte<T> getSource() {
		return source;
	}

	public Carte<T> getTarget() {
		return target;
	}

	private Carte<T> source;
	private Carte<T> target;
	
	public DnDEvent(Carte source, Carte target)
	{
		super();
		this.source = source;
		this.target = target;
	}
	

}
