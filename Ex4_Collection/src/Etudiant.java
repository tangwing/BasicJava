import java.util.HashMap;
import java.util.Iterator;

/**
 * 描述人对象，拥有两个属性，分别是名字和性别。
 * C'est la classe qui représente un étudiant.
 * @author 尚磊
 * @param non
 * @see javadoc.tool.Car
 * @version 1.0, 2005-04-12

 * @since JDK1.3
 */

public class Etudiant {

	private String nomEtu;
	private HashMap<Matiere, Float> notesMap;
	
	public Etudiant(String nom)
	{
		nomEtu = nom;
		notesMap = new HashMap<Matiere, Float>();
		
	}
	
	public Etudiant addNote(Matiere m, Float note) throws IllegalNoteException
	{
		if(note == null || note < 0)
			throw new IllegalNoteException();
		notesMap.put(m, note);
		return this;
	}
	
	public float getMoyennePondere()throws NoNoteException
	{
		if(notesMap.isEmpty())
			throw new NoNoteException();
		float somme = 0;
		Iterator<Matiere> iM = notesMap.keySet().iterator();
		while(iM.hasNext())
		{
			Matiere m = iM.next();
			somme += notesMap.get(m)*m.getCoefficient();
		}
		// Une antre façons : notesMap.entrySet()
		return somme/notesMap.size();
	}
	

	class IllegalNoteException extends Exception{
		private static final long serialVersionUID = 1L;
	}
	
	static public class NoNoteException  extends Exception{
		private static final long serialVersionUID = -7519281109385540802L;
		
	}
	
}
