// 每个类只能拓展一个类，但是可以实现多个接口
package EmployeeClass;

import java.util.*;

public class Employee implements Comparable<Employee>
{
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
        hireDay = calendar.getTime();
    }
    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
      return salary;
    }

    public Date getHireDay()
    {
      return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public int compareTo(Employee other)
    {
      return Double.compare(salary, other.salary);
    }

    public String toString()
    {
      return "name:" + this.name + " salary: " + this.salary;
    }

}
