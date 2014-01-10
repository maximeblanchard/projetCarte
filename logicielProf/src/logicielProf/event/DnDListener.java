package logicielProf.event;

import java.util.EventListener;

import logicielProf.donnee.Carte;

public interface DnDListener extends EventListener
{
	void glisser(Carte<?>  source);
	void deposer(Carte<?> cibleS);
}
