/**
 * 实现单例模式一共有三种方式，分别为
 * 1）构造器私有，导出公有的静态成员
 * 2）构造器私有，公有的成员是一个静态工厂方法
 * 3）使用一个包含单个元素的枚举类型; 最佳方法
 */

//1）
public class Elvis {
  public static final Elvis INSTANCE = new Elvis();
  private Elvis() {
    ...
  }

  public void leaveTheBuilding() {
    ...
  }
}

//2)
public class Elvis {
  private static final Elvis INSTANCE = new Elvis();
  private Elvis() {
    ...
  }
  public static Elvis getInstance() {
    return INSTANCE;
  }

  public void leaveTheBuilding() {
    ...
  }
}

//3)
public enum Elvis {
  INSTANCE;

  public void leaveTheBuilding() {

  }
}
