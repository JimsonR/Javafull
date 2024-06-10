public class Break {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] arr = {1,2,3,4,5};
//        for(int i : arr)
//        {
//            System.out.println(i);
//        }
//        for (int x = 0; x < 10; x++) {
//            System.out.println(x);
////            return 0;
//        }

        boolean flag = false;
    for (int x = 0; x < 10 && flag; x++) {
        System.out.println(x);
    }
//    return flag ? 1 : 0;
    try{
        for (int x = 0; x < 10; x++){
            System.out.println(x);
            if (x == 5) {
                throw new Exception("loop end");
            }
            }
        }
    catch (Exception e) {
        System.out.println(e);
    }
        }
    }

