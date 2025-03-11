public class myTest{
  public static void main (String[] args){
    SubClass s = new SubClass();
    s.print();
  }
}

class SuperClass{
  int myID = 1;
  public void print(){
    System.out.println(myID);
  }
}

class SubClass extends SuperClass{
  int myID;
}
