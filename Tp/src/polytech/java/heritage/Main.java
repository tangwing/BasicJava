package polytech.java.heritage;

public class Main{
	
	public static void main(String[] argv)
	{
//		Homme bob = new Homme("bob");
//		System.out.println( Animale.nbAnimale +"\n"
//				+Mammifere.nbMammifere+"\n"
//				+Homme.nbHomme);
		
		Animal[] animaux = new Animal[5]; 
		animaux[0] = new Mammifere("MachinTruc"); 
		animaux[1] = new Mammifere(); 
		animaux[2] = new Animal("Médor"); 
		animaux[3] = new Homme(); 
		animaux[4] = new Homme("Robert"); 
		for(int i=0;i<animaux.length;i++) 
		{
			System.out.println(animaux[i]); 
		} 
	}
}