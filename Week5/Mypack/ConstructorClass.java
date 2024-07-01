package Mypack;

 public class ConstructorClass{
   private int i;
   private  int j;
   private  int k;

    public ConstructorClass(){

   }
//    private ConstructorClass(){
//
//    }
     ConstructorClass(int i)//package-private
     {
        this.i = i;
    }

    protected ConstructorClass(int i , int j){
        this.i = i;
        this.j = j;
        System.out.println("Protectedconstructor");

    }

    public ConstructorClass(int i , int j , int k){
        this.i = i;
        this.j = j;
        this.k = k;
    }

    public static void main(String[] args) {
     ConstructorClass privateConstructorClass = new ConstructorClass(); // cannot create outside the Constructorclass
     ConstructorClass defaultConstructorClass = new ConstructorClass(9);
     ConstructorClass protectedConstructorClass = new ConstructorClass(0,9);
     ConstructorClass publicConstructorClass = new ConstructorClass(9,9,9);
    }
}
