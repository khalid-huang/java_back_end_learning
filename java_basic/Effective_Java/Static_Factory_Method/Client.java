/**
 * 测试类
 */

 public class Client {
     public static void main(String[] args) {
         Doll doll1 = DollFactory.getType("cloth");
         doll1.getInfo();
         Doll doll2 = DollFactory.getType("barbie");
         doll2.getInfo();
     }
 }
