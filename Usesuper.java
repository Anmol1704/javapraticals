class A
{
	int i;
}
class B extends A
{
	int i;
	B(int a,int b)
	{
		super.i=a;
		i=b;
	}
	
	void show()
	{
		System.out.println("i in superclass :"+super.i);
		System.out.println("i in subclass :" + i);
	}
}
class Usesuper
{
	public static void main(String args[])
	{
		B sub0b= new B(1,2);
		sub0b.show();
	}
}