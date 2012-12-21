import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * C'est une class permettant de représenter un ensemble de note et de calculer la
 * moyenne de celles-ci. On utilise ArrayList pour représenter cet ensemble.
 * */

public class Notes {
	
	//L'ensemble des notes, utilise l'interface
	private List<Float> noteList;
	//private ArrayList<Float> noteList;
	
	//Constructeur
	public Notes()
	{
		noteList = new ArrayList<Float>();
	}
	
	//Penser à mieux choisir le type de retour
	//Ici on peut retourner Notes pour faire l'encha
	public Notes addNote(float note)
	{
		noteList.add(note);
		return this;
	}
	
	public float getSomme()
	{
		float somme = 0;
		//Utiliser Iterator si on n'a besoin de suprimer pendant le parcours
//		Iterator<Float> iF = noteList.iterator();
//		while(iF.hasNext())
//		{
//			Float f = iF.next();
//			somme += f;
//		}
		
		//C'est comme la façons naïve qui a le ^m problème de synchronisation
		for(Float note : noteList)
		{
			somme += note.floatValue();
		}
		return somme;
	}
	
	//Calculer la moyenne de cette list des notes
	public float getMoynne()
	{
		return getSomme()/noteList.size();
	}
	
}
