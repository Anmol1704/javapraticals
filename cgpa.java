import java.util.Scanner;

class cgpa
{
	public static void main(String args[])
	{
		float data;
		Scanner scin = new Scanner(System.in);
		System.out.print("ENTER THE CGPA : ");
		data = scin.nextFloat();
		if(data >= 90)
		{
			System.out.println(" THE GRADE IS O ");	
		}	
		else if(data >= 80 && data < 90)
		{
			System.out.println("THE GRADE IS A+ ");	
		}
		else if(data >= 70 && data < 80)
		{
			System.out.println("THE GRADE IS A ");	
		}
		else if(data >= 60 && data < 70)
		{
			System.out.println("THE GRADE IS B+ ");
		}
		else if(data >= 50 && data < 40)
		{	
			System.out.println("THE GRADE IS B ");
		}
		else if(data >= 40 && data < 50)
		{
			System.out.println("THE GRADE IS C ");
		}
		else
		{
			System.out.println("THE GRADE IS F");
		}
	}
}