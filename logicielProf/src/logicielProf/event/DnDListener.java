package logicielProf.event;

import java.util.EventListener;

public interface DnDListener extends EventListener
{
	void glisser(DnDEvent e);
	void deposer(DnDEvent e);
}
