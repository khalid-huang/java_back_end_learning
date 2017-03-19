//关于多态；“is-a”规则的另一种表述法是置换法则，它表明程序中出现超类对象的地方都可以用子类对象置换；Java核心技术卷1：p173()；可以参考http://www.cnblogs.com/chenssy/p/3372798.html；归纳起来就是：“继承”，“重写”，“向上转型”；分为两步，第一步是通过被引用对象(父类)的类型确定this指向；然后在这个被引用对象父类中找方法 ，如果找到了看看对象的引用对象（子类）有没有重载该方法，有的话调用子类的，没有的簅调用自己的；如果没有找到这个方法，就看看参数有没有超类，向上找；
package EmployeeClass;

public class Manager extends Employee
{
  private double bonus;

  public Manager(String n, double s, int year, int month, int day)
  {
    super(n, s, year, month, day);
    this.bonus = 0;
  }

  public void setBouns(double b)
  {
    bonus = b;
  }

  public double getSalary()
  {
    double baseSalary = super.getSalary();// super和this并不是类似于引用的存在，不能将它们的值赋给其他变量；它们只是指示编译器调用超类方法的特殊关键字
    return baseSalary + bonus;
  }
}
