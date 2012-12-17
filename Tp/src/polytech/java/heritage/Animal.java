package polytech.java.heritage;

public class Animal {

	public enum Sexe{MASCULIN, FEMININ, NEUTRE}
	protected String nom = "";
	protected Sexe sexe;
	public static int nbAnimale = 0;
	
	public Animal()
	{
		System.out.println("Une b�b�te est cr��e!");
		nbAnimale++;
	}
	
	public Animal( String nom)
	{
		this.nom = nom;
		System.out.println("Une b�b�te est cr��e!");
		nbAnimale++;
	}
	
	public String toString()
	{
		if(nom == "")
			return "Je suis un animal.";
		else
			return "Je suis un animal de nom " + nom +".";
	}
}
