/**
 * 在支持垃圾回收的语言中，内在泄漏是很隐藏的，如果一个对象引用被无意识保留起来了，那么垃圾回收机制不公不会处理这个对象，而且也不会处理这个对象所引用的其他对象。
 * 其修复的方法简单，就是要把对象显示置为null
 */

public class Stack {
  private Object[] elements;

  //如下的方法就有问题，只是--size了，保是里面的东西并没有被回收的
  public Object pop() {
    if(size == 0) {
      throw new EmptyStackException();
    return element[--size];
    }
  }
  //修改如下
  public Object pop() {
    if(size == 0) {
      throw new EmptyStackException();
    Object result = elements[--size];
    elements[size] = null;
    return result;
    }
  }
}
