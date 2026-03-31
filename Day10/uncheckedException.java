package Day10;

public class uncheckedException{
  public static void main(String[] args) {
    try{
      //int a =10/0;
      int[] m = new int[3];
      m[5]=10;
      //System.out.println(a);
    }catch(ArithmeticException e){
      System.out.println(e);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println(e);
    }
  }
}
