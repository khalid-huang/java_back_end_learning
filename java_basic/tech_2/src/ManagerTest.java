import EmployeeClass.*;

public class ManagerTest
{
  public static void main(String args[])
  {
    Manager boss = new Manager("Carl Cracker", 8000, 1989, 12, 15);
    boss.setBouns(1000);
    System.out.println("bouns: " + boss.getSalary());
  }
}
