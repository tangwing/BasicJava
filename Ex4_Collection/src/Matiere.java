/*
 * C'est la classe qui repr¨¦sente une matiere.
 * */
public class Matiere {

	//Le nom de la matiere
	private String nomMatiere;
	
	//Le coefficient poss¨¦d¨¦ par chaque matiere
	private float coefficient;
	
	public Matiere(String nom)
	{
		nomMatiere = nom;
		coefficient = 1;//Le coefficient par d¨¦faut est 1.
	}
	
	public Matiere(String nom, float coef)
	{
		nomMatiere = nom;
		coefficient = coef;
	}
	
	//Getters and setters
	public String getNomMatiere() {
		return nomMatiere;
	}
	
//	public void setNomMatiere(String nomMatiere) {
//		this.nomMatiere = nomMatiere;
//	}
	
	public float getCoefficient() {
		return coefficient;
	}
	
	public void setCoefficient(float coefficient) {
		this.coefficient = coefficient;
	}
}
