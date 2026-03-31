package Day10;
class Name{
  private String name;
  public void setname(String name){
    this.name = name;
  }
  String getname(){
    return this.name;
  }
}
public class gettersetter {
  public static void main(String[] args) {
    Name n = new Name();
    n.setname("abc");
    System.out.println(n.getname());
  }
}