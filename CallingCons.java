class A
{
	A()
	{
		System.out.println("Inside A is a constructor");
	}
}
class B extends A
{
	B()
	{
	System.out.println("Inside B is a constructor");	
	}
}
class C extends B
{
	C()
	{
	System.out.println("Inside C is a constructor");	
	}
}
class CallingCons
{
	public static void main(String args[])
	{
		C c=new C();
	}
}