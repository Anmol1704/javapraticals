import java.util.*;

class StandardDeviation
{
  public static void main(String args[])
  {
    int[] data;
    double sigma;
    data = getData();
    sigma = computeStdDev(data);
    outputStdDev(sigma);
  }
  public static int[] getData()
  {
    Scanner scan = new Scanner(System.in);
    int size;
    int[] array;
    
    System.out.println("Enter the number of data: ");
    size = scan.nextInt();
    array = new int[size];
    for(int i=0; i<size; i++)
    {
      System.out.print("Enter the data " + (i+1) + ": " );
      array[i]=scan.nextInt();
    }
    return array;
  }
  public static double computeStdDev(int[] array)
  {
    double total, mean, variance, sigma;
    total = 0;
    for(int i = 0; i < array.length; i++)
      total = total = array[i];
    mean = total/array.length;
    
    //square each of the difference and then add
    total = 0;
    for(int i = 0; i<array.length; i++)
      total = total + Math.pow(array[i] - mean, 2);
      
      //find variance by dibiding the number of items
      variance = total/array.length;
      
      //find standard deviation by taking square root of the variance 
      sigma = Math.sqrt(variance);
      return sigma;
  }
  
  public static void outputStdDev(double sigma)
  {
    System.out.printf("Standard Deviation: %.2f", sigma);
    System.out.println();
  }
}