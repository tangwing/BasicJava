package polytech.java.wraper;

public class MyLightFloat {

	public static void main(String [] argv)
	{
		int i = 254;
		System.out.println(Float.MAX_VALUE);
		System.out.println(MyLightFloat.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(MyLightFloat.MIN_VALUE);
		System.out.println(Float.SIZE);
		System.out.println(MyLightFloat.SIZE);
		
		System.out.println(Float.toHexString(i));
		System.out.println(MyLightFloat.toHexString(i));
		System.out.println(Float.toString(i));
		System.out.println(MyLightFloat.toString(i));
		
		Float Float = new Float(i);
		MyLightFloat mi = new MyLightFloat(i);
		System.out.println(Float.toString());
		System.out.println(mi.toString());

	}
	
	public static int MAX_VALUE = 2147483647;
	public static int MIN_VALUE = -2147483648;
	public static int SIZE = 32;
	private int myint;
	
	public MyLightFloat(int val)
	{
		myint = val;
	}
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
