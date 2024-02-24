class A
{
	int i;
	private int  j;
	void setij(int x,int y)
	{
		i = x;
		j=y;

	}
}

class B extends A
{
	int total;
	int j;
	
	void sum()
	{
		total = i + j; //  j has a private access in class A
	}
}

class Access
{
	public static void main(String args[])
	{
		B subOb = new B();
		subOb.setij(10,12);

		subOb.sum();
		System.out.print("Total is " +  subOb.total);
	}
}