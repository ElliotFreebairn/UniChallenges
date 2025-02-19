public class myTest2{
  public static void main (String[] args){
    SubClass s = new SubClass();
    s.print();
  }
}

class SuperClass{
  int myID = 1;
}

class SubClass extends SuperClass{
  int myID = 2;
  public void print(){
    System.out.println(super.myID);
  }
}
 
