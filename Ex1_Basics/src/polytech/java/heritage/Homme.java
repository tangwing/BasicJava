package polytech.java.heritage;

public class Homme extends Mammifere{

	
//	private String idSecuriteSocial;
//	private String adressePostale;
	public static int nbHomme = 0;
	
	public Homme()
	{
		super();
		nbHomme++;
	}
	public Homme(String nom) 
	{
		super(nom);
		nbHomme++;
	}
	
	public String toString()
	{
		return super.toString() + "Je suis un homme.";
	}
}
