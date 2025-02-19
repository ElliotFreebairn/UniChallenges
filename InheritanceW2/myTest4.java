class myTest4 {
 public static void main(String[] args) {
  SubClass s = new SubSubClass();
 System.out.println(s.toString()); }
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
 public String toString(){
 return "SubSubClass";
 }
}
