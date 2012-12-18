package polytech.java.math;

public class MesMaths {

	public static int factorielle( int n)
	{
		if(n<=1) return 1;
		else
			return n*factorielle(n-1);
	}
	
	public static int puissance(int i, int j)
	{
		return (int) Math.pow(i, j);
	}
	
	public static int puissanceDe10(int n)
	{
		return (int) Math.pow(10, n);
	}
}
