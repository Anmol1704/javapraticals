import java.util.Scanner;
class CheckSum
 {
  public static void main(String args[])
   {
	byte firstval,secval;
	int sum=0;
	Scanner scin=new Scanner(System.in);
	System.out.println("enter first value:");
	firstval=scin.nextByte();
	System.out.println("enter second value:");
	secval=scin.nextByte();
	while(firstval<=secval)
	{ 
	  if(firstval<=secval)
	   {
	     sum=sum+firstval;
	     firstval++;
	   }
	  else
	   {
	     sum=sum+secval;
	     secval--;
	   }
	 }
	System.out.println("the sum is :"+sum);
   }
}