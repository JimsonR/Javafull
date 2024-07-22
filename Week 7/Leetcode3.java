public class Leetcode3 {
    public static void main(String[] args) {
      String s=  "00000010100101000001111010011100";
        System.out.println(s.length());
//       int ns = 00000010100101000001111010011100;
       Integer init  =  43261596;
      int n = 1;
      int val=0;
//      for(int i = s.length()-1;i>=0;i-- ){
//          val += Integer.parseInt(s.charAt(i)+"")*n;
//         n *=2;
////          System.out.println(n);
//
//
//      }

        for(int i = 0;i<s.length();i++ ){
            val += Integer.parseInt(s.charAt(i)+"")*n;
            n *=2;
//          System.out.println(n);


        }
//        System.out.println(val);
//        System.out.println(n);
        int temp = init;
      StringBuilder s1 = new StringBuilder();
      int c = 0;
        System.out.println(Integer.SIZE);
//        while (temp>0){
//            System.out.println();
//            s1.append((temp % 2));
//            temp = temp/2;
//            c++;
//        }
//        boolean bool =(temp&&1)>0;
//        System.out.println((temp&1)+" "+(temp/2 & 1));
int newN=0;

        for(int i= 0 ; i<Integer.SIZE;i++){
            newN = newN<<1;
            if((temp&1)>0){
                newN = newN ^ 1;
            }
            temp = temp>>1;

        }

        System.out.println(newN);

    }
}
