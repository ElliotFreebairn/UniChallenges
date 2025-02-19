class myTest5 {

 public static void main(String[] args) {

   SubClass s = new SubClass();

  s.superClassField = 20;

  System.out.println(s.toString());

  }

}

class SuperClass{

 protected int superClassField = 10;

 public String toString(){

  return "Superclass field is " + superClassField;

 }

}

class SubClass extends SuperClass{


}


