import java.util.Scanner;

class week
{
	public static void main(String args[])
	{
		int days;
		Scanner scin = new Scanner(System.in);
		System.out.print("ENTER THE NUMBER BETWEEN 1-7 : ");
		days = scin.nextInt();
		switch(days)
		{
			case 1: System.out.println("SUNDAY");
				break;
			case 2: System.out.println("MONDAY");
				break;
			case 3: System.out.println("TUESDAY");
				break;
			case 4: System.out.println("WEDNESDAY");
				break;
			case 5: System.out.println("THURDAY");
				break;
			case 6: System.out.println("FRIDAY");
				break;
			case 7: System.out.println("SATURDAY");
				break;
			default:System.out.println(" !! ENTER THE VALID NUMBER !! ");
				
		}
	}
}