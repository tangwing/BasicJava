package polytech.java.heritage;

public class Mammifere extends Animal{

	
	protected int nbMamelle;
	protected String espace;
	public static int nbMammifere = 0;
	
	public Mammifere() {
		super();
		nbMammifere++;
	}
	
	public Mammifere(String nom) {
		super(nom);
		nbMammifere++;
	}
	
	public String toString()
	{
		return super.toString() + "Je suis un mammifère.";
	}
}
