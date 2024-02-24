class MultipleCatches{
	public static void main(String args[]){
		try{
			int a = args.length;
			System.out.println("a = " + a);
			int b = 42/a;
			int c[] = {1};
			c[42] = 9;
		}
		 catch(ArithmeticException e)
		{
			System.out.println("DIVIDE BY ZERO :" +e);
		}
		 catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("DIVIDE BY ZERO :" +e);
		}
		System.out.println("AFTER try/catch blocks ");
		
	}	
}