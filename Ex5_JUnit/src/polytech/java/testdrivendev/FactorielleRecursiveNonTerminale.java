package fr.gatay.cedric.epudi.di4.tp3;

public class FactorielleRecursiveNonTerminale implements IFactorielle{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FactorielleRecursiveNonTerminale(){}

	
	@Override
	public int factorielle(int nb) throws IllegalArgumentException
	{
		if(nb<0) throw new IllegalArgumentException();
		if(nb == 0) return 1;
		else
			return nb*factorielle(nb-1);
	}

}
