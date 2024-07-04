public class StringBuflder {
    public static void main(String[] args) throws InterruptedException {
        StringBuffer sbuff = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder("Jim");
        final Object lock = new Object();
        String[] s1 = {""};

//        Thread t1 = new Thread(()->{
//            synchronized (s1[0]){
//
//
//            for(int i = 0 ; i< 20 ; i++) {
////                System.out.println(sbuff.append(i+" ").hashCode());
////                System.out.println(stringBuilder.append(i+" ").hashCode());
////                System.out.println(s1.concat(""+i).hashCode());
////                synchronized (s1[0]) {
//                    s1[0] = s1[0].concat(i + " ");
////                }
//            }
//            }
//        });
//        Thread t2 = new Thread(()->{
//            synchronized (s1[0]){
//                for (int i = 0; i < 20; i++) {
////                sbuff.append(i+" ");
////                stringBuilder.append(i+" ");
////                s1.concat(" "+i);
////                System.out.println(sbuff.append(i+" ").hashCode());
////                System.out.println(stringBuilder.append(i+" ").hashCode());
////                System.out.println(s1.concat(""+i).hashCode());
////                System.out.println(s);
////                    synchronized (s1[0]) {
//                        s1[0] = s1[0].concat(i + " ");
////                    }

//                }
//            }
//        });
//
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();

//StringBuilder[] asd = new StringBuilder[5];
//        System.out.println("StringBuffer"+"\n"+sbuff);
//        System.out.println("StringBuilder"+"\n"+stringBuilder);
//        System.out.println("String"+"\n"+s1[0]);
//        System.out.println( stringBuilder.compareTo(new StringBuilder("Kim")));
//        System.out.println(new StringBuilder("Madam"));

//        System.out.println(new StringBuilder(new StringBuffer()).equals( new StringBuilder(new StringBuilder("madam")).reverse()));
        String s = new StringBuilder("asdasd").toString();
        System.out.println(stringBuilder.toString().getClass());
//        System.out.println(new StringBuilder("asdasd")+(new StringBuffer("asd").toString()));


    }
}
