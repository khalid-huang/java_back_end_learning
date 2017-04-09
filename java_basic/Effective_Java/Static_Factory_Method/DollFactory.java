/**
 * 静态工厂类
 */

public class DollFactory {
  public static Doll getType(String name) {
    if("barbie".equals(name)){
        return new BarbieDoll();
    }else if("cloth".equals(name)){
        return new ClothDoll();
    }else{
        return null;
    }
  }
}
