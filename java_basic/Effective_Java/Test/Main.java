public class Main {
  public static void main(String[] args) {
    Apple apple = new Apple();
    FruitName fn = (FruitName) apple.getClass().getAnnotation(FruitName.class);
    System.out.println(fn.msg());
  }
}
