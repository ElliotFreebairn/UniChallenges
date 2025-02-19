class MyTest {
  public static void main(String[] args) {
    print(new Object());
    print(new SuperClass());
    print(new SubClass());
    print(new SubSubClass());
  }
  public static void print(SubClass s){
    System.out.println(s.toString());
  }
}
 
class SuperClass{
  public String toString(){
    return "Superclass";
  }
}
class SubClass extends SuperClass{
  public String toString(){
    return "Subclass";
  }
}
class SubSubClass extends SubClass{
}
