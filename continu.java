class continu
{
	public static void main(String args[])
	{
		short s;
		s=(short)args[0];
		check(s);
	}
	public static void check(short s)
	{
		short i=0;		
		while(i<=s)
		{
			if(i%2==0)
			{
				continue;
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}
