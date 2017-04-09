public class test {
  public static void main(String[] args) {
      long startTime = System.currentTimeMillis();

      for(int i = 0; i < 1000000; i++) {
        // String s = new String("how"); // 11ms
        String s = "how"; //4ms
      }

      long endTime = System.currentTimeMillis();
      System.out.println("程序运行时间" + (endTime - startTime) + "ms");

  }
}
