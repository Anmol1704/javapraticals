import java.util.*;

class Courses
{
  public static void main(String args[])
  {
    Course course;
    String str, dept, number, name;
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter the course: ");
    str = scan.nextLine();
    dept = str.substring(0, str.indexOf(" "));
    str = str.substring(str.indexOf(" ")+1, str.length());
    number = str.substring(0,str.indexOf(" "));
    name = str.substring(str.indexOf(" ")+1, str.length());
    course = new Course(dept, number, name);
    System.out.println();
    System.out.println("The class, \""+ course.getName() + "\", is a ");
    System.out.println(course.getLevel() + " level class offered by the ");
    System.out.println(course.getDepartment()+" department.");
  }
}