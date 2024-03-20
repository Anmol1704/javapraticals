public class ExamScores
{
  public static void main(String args[])
  {
    int[][] scores = {{72, 85, 91},
                      {95, 89, 90},
                      {77, 65, 73},
                      {97, 92, 93} };
    studentAvg(scores);                  
  }
  public static void studentAvg(int[][] inArray)
  {
    double total, average;
    for(int i=0; i<inArray.length-1; i++)
    {
      total = 0.0;
      for(int j=0; j<inArray.length-1; j++)
        total = total + inArray[i][j];
      average = total/inArray[i].length;
      System.out.printf("Average for student "+(i+1)+": %5.2f", average);
      System.out.println();
    }
  }
}