interface Ins{
    void poi();
}
public class Main
{
  static Main main = new Main();
    public enum Season{
        WINTER("hot");
        String desc;

        Season(String desc){
            this.desc = desc;
        }
        }



        void twice ( int[] arr, Integer variable){

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }

     variable = variable * 2;

    }

    public static void main(String[] args) {
        int[] arr = {10,11,12};

        Ins ins = ()->{
            System.out.println("assd");
        };
//    Main main1 = new Main();
        int variable = 129;
      main.twice(arr,variable);

        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }

//        System.out.println( main.variable);

    }
}