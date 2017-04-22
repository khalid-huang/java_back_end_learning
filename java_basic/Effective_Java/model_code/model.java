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
