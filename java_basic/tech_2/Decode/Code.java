public class Code {
  public static void encode() {
    String name = "I am 群册";
    toHex(name.toCharArray());
    try {
      byte[] iso8859 = name.getBytes("ISO-8859-1");
      toHex(iso8859);
      byte[] gb2312 = name.getBytes("GB2312");
      toHex(gb2312);
      byte[] gbk = name.getBytes("GBK");
      toHex(gbk);
      byte[] utf16 = name.getBytes("uft16");
      toHex(utf16);
      byte[] utf8 = name.getBytes("utf8");
      toHex(utf8);
    } catch (UnsupportedEncodingExcption e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    Code code = code();
    code.encode();
  }
}
