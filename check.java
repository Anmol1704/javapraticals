class check
{
	public static void main(String args[])
	{
		byte a=1;
		short b;
		int c;
		b=a;
		c=b;
		
		System.out.println("byte is"+a);
		System.out.println("short is"+b);
		System.out.println("int is"+c);
		short d=(byte)c;
		long e=(byte)c;
		System.out.println("byte is"+d);
		System.out.println("short is"+e);
		
	}
}