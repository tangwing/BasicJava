package polytech.java.math;
public class Factorielle { 
  int valeur;  
  public Factorielle() { 
    System.out.println(valeur);
	  //this.valeur = 5;  
  } 
  public int getResultat() {  
    int i, resultat = 1;  
    if (valeur > 1) 
      for (i = 1; i <= valeur; i++) 
        resultat *= i;  
    return resultat;  
  }  
  public static void main(String[] args) {  
    System.out.println("Resultat : " 
              +(new Factorielle()).getResultat()); 
  } 
} 