import java.util.Scanner
class posneg
{
	public static void main(String args[])
	{
		int a;
		Scanner scin = new Scanner(System.in);
		a=scin.nextInt();
		if(a>=0)
		{
			System.out.println("positive no");
		}	
		else
		{
			System.out.println("negative no");	
		}
		
	}
}