 class India{
    static class WorldCup{
        static int m1(){

            System.out.println("asd "+ i);
            return 1;
        }
        int k = m1();
         private static int i = 10;


    }

}

public class NestedPract {
//    static int m2(){
//        return 1;
//    }
//    int i = m2();
    public static void main(String[] args) {
//        System.out.println(new India().new WorldCup().i);
        India india = new India();
        India.WorldCup indworldcup = new India.WorldCup();
//        India.WorldCup worldCup = new India().new WorldCup();
//        System.out.println(worldCup.i);
//        System.out.println(India.WorldCup.i);
        India.WorldCup asdasd= new India.WorldCup();
//        System.out.println(asdasd.i);

   }

}
