import java.util.*;
import java.text.DateFormatSymbols;


public class Main
{
    public static void main(String[] args)
    {
//        Main test = new Main();
//        test.input();
//        test.CalendarTest();
        Employee staff =new Employee("kaka", 123.4, 2001, 4, 5);
        System.out.printf(staff.getName());
    }
    private void input()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your name?");
        String name = in.nextLine();

        System.out.print("How old are you");
        int age = in.nextInt();

        System.out.println("Hello, " + name + " age: " + age);

    }

    public void CalendarTest()
    {
        GregorianCalendar d = new GregorianCalendar();

        int today = d.get(Calendar.DAY_OF_MONTH);
        int month = d.get(Calendar.MONTH);

        d.set(Calendar.DAY_OF_MONTH,1);

        int weekday = d.get(Calendar.DAY_OF_WEEK);
        int firstDayOfWeek = d.getFirstDayOfWeek();

        int indent = 0;
        while (weekday != firstDayOfWeek)
        {
            indent++;
            d.add(Calendar.DAY_OF_MONTH, -1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        }
        String[] weekdayNames = new DateFormatSymbols().getShortMonths();
        do
        {
            System.out.printf("%4s", weekdayNames[weekday]);
            d.add(Calendar.DAY_OF_MONTH, 1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        } while (weekday != firstDayOfWeek);

        System.out.println();

        for(int i = 1; i <= indent; i++)
            System.out.print("   ");
        d.set(Calendar.DAY_OF_MONTH, 1);
        do
        {
            int day = d.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d", day);
            if (day == today) System.out.print("*");
            else System.out.printf(" ");
            d.add(Calendar.DAY_OF_MONTH, 1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
            if(weekday == firstDayOfWeek) System.out.println();
        } while (d.get(Calendar.MONTH) == month);
        if(weekday != firstDayOfWeek) System.out.println();
    }
}

class Employee
{
    private String name;
    private  double salary;
    private  Date hireDay;

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
}