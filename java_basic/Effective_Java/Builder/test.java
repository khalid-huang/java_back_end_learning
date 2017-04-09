public class test {
  public static void main(String[] args) {
    NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).calories(100).sodium(10).carbogydrate(27).build();
    System.out.println(cocaCola);
  }
}
