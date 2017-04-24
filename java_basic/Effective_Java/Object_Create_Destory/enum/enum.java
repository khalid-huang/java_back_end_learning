/**
 * 用enum代替int常量
 */

//太阳系中的8个行星，每个行星都有质量和半径，通过这两个属性可以 计算出它的表面重力
public enum Plant {
  MERCURY(3.302e+23, 2.439e6);
  VENUS(4.869e+23, 6.052e6);
  EARTH(5.975e+24, 6.378e6);
  MARS(6.419e+23, 3.393e6);
  JUPITER(1.899e+27, 7.149e7);
  SATURN(...,...);
  URANUS(...,...);
  NERTUNE(...,...);
  private final double mass;
  private final double radius;
  private final double surfaceGravity;


  private static final double G = 6.673E-11;

  Plant(double mass, double radius) {
    this.mass = mass;
    this.radius = radius;
    surfaceGravity = G * mass / (radius * radius);
  }

  public double mass() {
    return mass;
  }
  public double radius() {
    return radius;
  }
  public double surfaceGravity() {
    return surfaceGravity;
  }
  public double surfaceWeight(double mass) {
    return mass * surfaceGravity;
  }
}

//运算法则
public enmu Operation {
  PLUS("+") {
    double apply(double x, double y) {
      return x + y;
    }
  },
  MINUS("-") {
    double apply(double x, double y) {
      return x - y;
    }
  },
  TIMES("*") {
    double apply(double x, double y) {
      return x * y;
    }
  },
  DIVIDE("/") {
    double apply(double x, double y) {
      return x / y
    }
  };

  private final String symbol;
  Operation(String symbol) {
    this.symbol = symbol;
  }
  abstract double apply(double x, double y);
}


//还有一个工资的例子
emue PayrooDay {
  MONDAY(PayType.WEEKDAy), TUESDAY(payType.WEEKDAY),
  WEDNESDAY(PayType.WEEKDAY), THURSDAY(PayType.WEEKDAY),

}


//使用接口模拟可伸缩的枚举
public interface Operation {
  double apply(double, double y);
}

public enum BasicOperation implements Operation {
  PLUS("+") {
    public double apply(double x, double y) {
      return x + y;
    }
  },
  ....
  private final String symbol;
  BasicOperation(String symbol) {
    this.symbol = symbol;
  }
  @Override public String toString() {
    return symbol;
  }
}
