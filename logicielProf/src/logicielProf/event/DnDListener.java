package logicielProf.event;

public interface DnDListener<T>
{
	void glisser(DnDEvent<T> e);
	void deposer(DnDEvent<T> e);
}
