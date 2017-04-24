public class Model {
  @override
  public boolean equal(Object obj) {
    if (this == obj) {
      return true;
    }
    if(obj == null) {
      return false;
    }
    if(!(obj instanceof Model)) {
      return false;
    }
    Model m = (Model) obj;
    //.....
    return true;
  }
}

//如下的代码不希望生成 的时间是可变的，为了防止外部修改内部的状态，在返回内部数据的时候需要 返回保护性拷贝，而不是自身
public final class Period {
  private final Date start;
  private final Date end;

  public Period(Date start, Date end) {
    this.start = new Date(start); //需要拷贝
    this.end = new Date(end);

    if(this.start.compareTo(this.end) > 0)
      throw new IllegalArgumentException(start + " after " + end);
  }

  public Date start() {
    return new Date(start.getTime()); //需要副本
  }
  public Date end() {
    return new Date(end.getTime());
  }
}
