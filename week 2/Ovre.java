public class Ovre {
    int x;

    Ovre(int x) {
        this("jims");
//        this(231L,897L);
        this.x = x;
        System.out.println(this.x);
    }

    Ovre(String x) {

        System.out.println(x);
    }

    Ovre(Long x, Long y) {

        System.out.println(x + " " + y);

    }

    int sum(int a, int b) {

        if (a > 0) {

            System.out.println(a + " " + b);
            return a + b;
        } else {
            return sum(a - 1, b - 2);
        }
    }
    String sum (String a, String b){
        sum(1,2);
        System.out.println(a + " " + b);
        return a+b;
    }
    Long sum(Long a, Long b){
        sum(1,2);
        sum("kjlkj","jhjghg");
        return a+b;
    }
    public static void main(String[] args)throws Exception {
        Ovre ovre = new Ovre(5);
//        System.out.println(ovre.sum("ss","sss"));
        System.out.println(ovre.sum(987L,8798L));
//        Ovre ovre2 = new Ovre("Over", 5);
//        int n =100;
//        System.out.println(Integer.valueOf(n).toString());



    }
}
