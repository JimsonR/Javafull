package Subpack;


import Mypack.ConstructorClass;

public class ConstructorAccessTest extends ConstructorClass {
    int i ;
    int j;
    public ConstructorAccessTest(int i, int j){
        super(i,j);

    }
    public static void main(String[] args) {
             ConstructorClass constructorClass = new ConstructorClass(); // cannot create outside the Constructorclass
//        ConstructorClass defaultConstructorClass = new ConstructorClass(9); // cannot outside the package
        ConstructorAccessTest constructorAccessTest = new ConstructorAccessTest(9,0);



//        ConstructorClass protectedConstructorClass = new ConstructorClass(9,9);
//        ConstructorClass protectedConstructorClass1 = new ConstructorClass(0,9); // still wont work since although we can access protected stuff outside using subclass, we can do it with construcor parent call
//        ConstructorClass publicConstructorClass = new ConstructorClass(9,9,9);
    }
}
