import EmployeeClass.*;

import java.util.*;

public class EmployeeSortTest
{
  public static void main(String[] args)
  {
    Employee[] staff = new Employee[3];

    staff[0] = new Employee("harry hacker",  350000, 1989, 12, 1);
    staff[1] = new Employee("harry hacker1",  250000, 1989, 12, 1);
    staff[2] = new Employee("harry hacker2",  450000, 1989, 12, 1);
    if (staff[0] instanceof Comparable) {
      Arrays.sort(staff);
      for (Employee e : staff)
        System.out.print("name: " +  e.getName() + " , Salary= " + e.getSalary());
      }
  }
}
