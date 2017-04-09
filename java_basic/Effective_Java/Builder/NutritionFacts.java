public class NutritionFacts {
  private final int servingSize;
  private final int servings;
  private final int calories;
  private final int fat;
  private final int sodium;
  private final int carbogydrate;

  public static class Builder {
    // required parameters
    private final int servingSize;
    private final int servings;

    //options parameters
    private int calories = 0;
    private int fat = 0;
    private int carbogydrate = 0;
    private int sodium = 0;

    public Builder(int servingSize, int servings) {
      this.servingSize = servingSize;
      this.servings = servings;
    }

    public Builder calories(int val) {
      this.calories = val;
      return this;
    }

    public Builder fat(int val) {
      this.fat = val;
      return this;
    }

    public Builder carbogydrate(int val) {
      this.carbogydrate = val;
      return this;
    }

    public Builder sodium(int val) {
      this.sodium = val;
      return this;
    }

    public NutritionFacts build() {
      return new NutritionFacts(this);
    }
  }

  private NutritionFacts(Builder builder) {
    servingSize = builder.servingSize;
    servings = builder.servings;
    calories = builder.calories;
    fat = builder.fat;
    sodium = builder.sodium;
    carbogydrate = builder.carbogydrate;
  }

  public String toString() {
    return "servingSize: " + String.valueOf(this.servingSize) + " servings: " + String.valueOf(this.servings) + " calories: " + String.valueOf(this.calories);
  }

}
