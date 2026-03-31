package Day10;
public class throwexception {
  public static void main(String[] args) {
    int age =14;
    if(age<=18){
      throw new ArithmeticException("not eligible");
    }
  }
}
