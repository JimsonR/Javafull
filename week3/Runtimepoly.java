class Greatgrandparent{
//    Greatgrandparent(){
//        System.out.println("Greatgrandparent");
//    }
}
class Grandparent extends Greatgrandparent{
//    Grandparent(){
//        System.out.println("Grandparent");
//    }
}
class Parent extends Grandparent{
    int i = 10;
//    Parent(){
//        System.out.println("Parent");
//    }
  static void sound(){
    System.out.println("parent");
}
}
class Child extends Parent{
//    int i = 20;
//    Child(){
//        System.out.println("child");
//    }
   static void sound(){               //overrides parent; if static gives error
//        System.out.println(super.i); // child.super cannot be referenced from static context
//        System.out.println(this.i);  // child.this cannot be referenced from static context
        System.out.println("child");
    }
}
public class Runtimepoly {
    public static void main(String[] args) {
            Parent p = new Child();
            p.sound();
            Child child = new Child();
            child.sound();
    }
}
