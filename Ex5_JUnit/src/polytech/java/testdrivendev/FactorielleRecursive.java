package fr.gatay.cedric.epudi.di4.tp3;

public class FactorielleRecursive implements IFactorielle{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FactorielleRecursive(){}
	@Override
	public int factorielle(int nb) throws IllegalArgumentException
	{
		if(nb<0) throw new IllegalArgumentException();
		return factorielle2(nb, 1);
	}
	
	public int factorielle2(int nb, int last)
	{
		if(nb == 0)
			return last;
		else
		{
			int tmp = nb*last;
			//C'est comme un appel normal, pas besoin d'enregistrer le pile,
			//ça permet le compilateur de faire des optimisations
			return factorielle2(nb-1, tmp);
		}
	}

}
