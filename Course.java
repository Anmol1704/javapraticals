class Course
{
  private String department;
  private String number;
  private String name;
  private String level;
  
  public Course()
  {
    this("","","");
  }
  public Course(String dept,String number,String name)
  {
    setDepartment(dept);
    setNumber(number);
    setName(name);
    setLevel();
  }
  public void setDepartment(String dept)
  {
    if(dept.equals("CS"))
      department = "Computer Science";
    if(dept.equals("MA"))
      department = "Mathematics";
    else 
      department = "undetermined";
  }
  public void setNumber(String number)
  {
    this.number = number;
  }
  public void setName(String name)
  {
    this.name = name;
  }
  public void setLevel()
  {
    String str;
    char num;
    str = number.substring(0, 1);
    num = str.charAt(0);
    switch(num)
    {
      case '1': level = "first-year";
              break;
      case '2': level = "sophomore";
              break;
      case '3': level = "junior";
              break;
      case '4': level = "senior";
              break;
      default: level = "undetermined";
    }
  }
  public String getDepartment()
  {
    return department;
  }
  public String getNumber()
  {
    return number;
  }
  public String getName()
  {
    return name;
  }
  public String getLevel()
  {
    return level;
  }
}