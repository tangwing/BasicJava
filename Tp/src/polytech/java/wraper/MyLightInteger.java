package polytech.java.wraper;

public class MyLightInteger {

	public static void main(String [] argv)
	{
		int i = 254;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(MyLightInteger.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(MyLightInteger.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(MyLightInteger.SIZE);
		System.out.println(Integer.toBinaryString(i));
		System.out.println(MyLightInteger.toBinaryString(i));
		System.out.println(Integer.toHexString(i));
		System.out.println(MyLightInteger.toHexString(i));
		System.out.println(Integer.toOctalString(i));
		System.out.println(MyLightInteger.toOctalString(i));
		System.out.println(Integer.toString(i));
		System.out.println(MyLightInteger.toString(i));
		
		Integer integer = new Integer(i);
		MyLightInteger mi = new MyLightInteger(i);
		System.out.println(integer.toString());
		System.out.println(mi.toString());

	}
	
	public static int MAX_VALUE = 2147483647;
	public static int MIN_VALUE = -2147483648;
	public static int SIZE = 32;
	private int myint;
	
	public MyLightInteger(int val)
	{
		myint = val;
	}
	//Returns a string representation of the integer argument as an unsigned integer in base 2.
	static String toBinaryString(int i)
	{
		if( i < 2) return String.valueOf(i);
		else
			return toBinaryString(i/2)+ i%2;
	}
	//Returns a string representation of the integer argument as an unsigned integer in base 16.
	static String toHexString(int i)
	{
		if( i < 10) return String.valueOf(i);
		else if( i==10) return "A";
		else if( i==11) return "B";
		else if( i==12) return "C";
		else if( i==13) return "D";
		else if( i==14) return "E";
		else if( i==15) return "F";
		else
			return toHexString(i/16) + toHexString(i%16);
	}
    //Returns a string representation of the integer argument as an unsigned integer in base 8.
    static String toOctalString(int i)
    {
    	if( i < 8) return String.valueOf(i);
		else
			return toOctalString(i/8) + i%8;
    }
    public String toString()
    {
    	return toString(myint);
    }

    static String	toString(int i)
    {
    	if( i < 10) return String.valueOf(i);
		
		else
			return toString(i/10) + i%10;
    }

}
