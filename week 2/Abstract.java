abstract class Abstract {
 void m1(){
    System.out.println("m1- Abstract");
}
    int i = 10;
abstract void display();
abstract void display(int i);

}
class C extends Abstract{
    void m2(){
        System.out.println("m2-b");
    }
    void display(){
        System.out.println("display c");
    }
    void display(int i){
        System.out.println("display c"+i);
    }
}
class D {
    public static void main(String[] args) {
//        Abstract a = new A(); // -- ERROR abstract class cannot be instantiated
    Abstract d = new C();
    System.out.println(d.i);
    C dobj = new C();



    }

}


