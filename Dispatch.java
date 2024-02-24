class A
{	
	
	void callme()
	{
		System.out.println("inside A's method call");
	}
}
class B
{	
	
	void callme()
	{
		System.out.println("inside B's method call");
	}
}
class C
{	
	
	void callme()
	{
		System.out.println("inside C's method call");
	}
}
class Dispatch
{
	public static void main(String args[])
	{
		A a=new A();
		B b=new B();
		C c=new C();
	
		A r;
		r=a;
		r.callme();

	// r is the type of class A hence cannot be taken for b or c
	//	r=b;
		r.callme();
		
	//	r=c;
		r.callme();
	}
}
