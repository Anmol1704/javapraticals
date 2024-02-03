import java.util.Scanner;
class InDec{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c,d;
    c=++b;
    d=a++;
    c++;
    System.out.println("a=" +a);
    System.out.println("b=" +b);
    System.out.println("c=" +c);
    System.out.println("d=" +d);
    
    }
  }