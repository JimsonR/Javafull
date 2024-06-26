class Adds {
//   protected Adds() {
//System.out.println("Inside Adds constructor");
//   }
//    }
//    abstract class Adder {
//        String word;
//        String word1;
//        int num1;
//        int num2;
//        Adder(String word, String word1) {
//            this.word = word;
//            this.word1 = word1;
//        }
//        Adder( int num1, int num2){
//            this.num1 = num1;
//            this.num2 = num2;
//        }
//        String getWord () {
//            return word + word1;
//        }
//        int getNum () {
//            return num1 + num2;
//        }
//        abstract void getboth();
//
//    }
}
//class Sub extends Adds {
//    String word;
//    Sub() {
//System.out.println("Inside Sub constructor");
//    }
//}
public class Constr{
//    private Constr(){
//
//    }
    protected Constr(int num1, int num2){

    }
    public static void main(String[] args) {
//        Adder adder = new Adder("John Doe", "Doe");
//        Adds.Adder adds = new Adds.Adder("jim","son");
//        Constr constr = new Constr();
        Constr constr1 = new Constr(2,3);
//        Sub subs = new Sub();
//        Adds adds = new Sub();
        Adds adds1 = new Adds();

//        System.out.println(adder.getWord());
//        Adder adder1 = new Adder(12,22);
//        System.out.println(adder1.getNum());
    }

}
