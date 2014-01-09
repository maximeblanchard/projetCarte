package logicielProf.event;

import logicielProf.donnee.SuperCarte;

public class DnDEvent
{

	public SuperCarte getSource() {
		return source;
	}

	public SuperCarte getTarget() {
		return target;
	}

	private SuperCarte source;
	private SuperCarte target;
	
	public DnDEvent(SuperCarte source, SuperCarte target)
	{
		super();
		this.source = source;
		this.target = target;
	}
	

}
