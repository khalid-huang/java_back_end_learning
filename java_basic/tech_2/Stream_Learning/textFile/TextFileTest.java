import EmployeeClass.*;

import java.io.*;
import java.util.*;

public class TextFileTest
{
  public static void main(String[] args) throws IOException
  {
    Employee[] staff = new Employee[3];
    staff[0] = new Employee("Carl Craker", 75000, 1978, 12, 1);
    staff[1] = new Employee("Carl Craker1", 76000, 1938, 12, 1);
    staff[2] = new Employee("Carl Craker2", 77000, 1928, 12, 1);

    try (PrintWriter out = new PrintWriter("employee.dat", "UTF-8"))
    {
      writeData(staff, out);
    }

    try (Scanner in = new Scanner(new FileInputStream("employee.dat"), "UTF-8"))
    {
      Employee[] newStaff = readData(in);
      for (Employee e : newStaff)
        System.out.println(e);
    }
  }

  private static void writeData(Employee[] employees, PrintWriter out)
  {
    out.println(employees.length);

    for (Employee e : employees)
    {
      writeEmployee(out, e);
    }
  }

  private static Employee[] readData(Scanner in)
  {
    int n = in.nextInt();
    in.nextLine();

    Employee[] employees = new Employee[n];
    for(int i = 0; i < n; i++)
    {
      employees[i] = readEmployee(in);
    }
    return employees;
  }

  private static void writeEmployee(PrintWriter out, Employee e)
  {
    GregorianCalendar calendar = new GregorianCalendar();
    calendar.setTime(e.getHireDay());
    out.println(e.getName() + "|" + e.getSalary() + "|" + calendar.get(Calendar.YEAR) + "|" + (calendar.get(Calendar.MONTH)+1) + "|" + calendar.get(Calendar.DAY_OF_MONTH));
  }

  private static Employee readEmployee(Scanner in)
  {
    String line = in.nextLine();
    String[] token = line.split("\\|");
    String name  = token[0];
    double salary = Double.parseDouble(token[1]);
    int year = Integer.parseInt(token[2]);
    int month = Integer.parseInt(token[3]);
    int day = Integer.parseInt(token[4]);
    return new Employee(name, salary, year, month, day);
  }
}
