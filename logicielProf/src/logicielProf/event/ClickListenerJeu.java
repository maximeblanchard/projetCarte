package logicielProf.event;

import java.util.EventListener;

public interface ClickListenerJeu extends EventListener
{
	void ajouterCarte();
	void supprimerCarte();
	void envoyerSurLesCarte();
}
