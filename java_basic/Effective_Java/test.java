public class test {
  public static void main(String[] args) {
      long startTime = System.currentTimeMillis();
      String s = new String();
      StringBuilder sb = new StringBuilder(); //线程安全
      // StringBuffer 跟StringBuilder一样，但是它是非线程安全的，性能比更高
      for(int i = 0; i < 5000; i++) {

        //String的不可变性
        // String s = new String("how"); // 11ms //每次创建了一个
        // String s = "how"; //4ms 实际上都是s指向了同一个"how"

        //stringBuilder的可变性
        s += '1'; //29ms
        // sb.append("1"); //1ms
      }

      long endTime = System.currentTimeMillis();
      System.out.println("程序运行时间" + (endTime - startTime) + "ms");

  }
}
