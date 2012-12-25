
/**
 * A simple class of math
 * @author shang
 *
 */
public class MesMaths {

	public static int factorielle( int n)
	{
		if(n<=1) return 1;
		else
			return n*factorielle(n-1);
	}
	
	/**
	 * Calculate the j-th power of i
	 * @param i The base number.
	 * @param j The power.
	 * @return The j-th power of i
	 */
	public static int puissance(int i, int j)
	{
		return (int) Math.pow(i, j);
	}
	
	public static int puissanceDe10(int n)
	{
		return (int) Math.pow(10, n);
	}
}
