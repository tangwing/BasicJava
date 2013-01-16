package fr.gatay.cedric.epudi.di4.tp3;

public class FactorielleLineaire implements IFactorielle{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FactorielleLineaire(){}
	@Override
	public int factorielle(int nb) throws IllegalArgumentException
	{
		if(nb<0) throw new IllegalArgumentException();
		int fac = 1;
		for(int i=1; i<=nb; i++)
		{
			fac*=i;
		}
		return fac;
	}

}
