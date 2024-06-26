import java.util.ArrayList;
import java.util.Arrays;
//class SearchAlg {
//    int[] list;
//    int target;
//    int left;
//    int right;
//
//    SearchAlg(int[] list, int target) {
//        this.list = list;
//        this.target = target;
//        this.left = left;
//        this.right = right;
//
//    }
//
//    int binarySearch() {
//        int left = 0;
//        int right = list.length - 1;
//        int mid = (left + right) / 2;
//        if (list[mid] == target) {
//
//            return mid;
//        }
//        else if (list[mid] > target) {
//            return binarySearch();
//        }
//    }
//
//}
//class Jimmm{
//    Jimmm(){
//        System.out.println("Jimmm");
//    }
//}
class Sorting {
        int[] list;

     Sorting(int[] list){
        this.list = list;
    }
    String selectionSort() {
         for (int i = 0; i < list.length - 1; i++) {
             for (int j = i + 1; j < list.length; j++) {
                 if (list[i] > list[j]) {
                     int temp = list[i];
                     list[i] = list[j];
                     list[j] = temp;

                 }
             }
         }
        return Arrays.toString(list)+" this is  selection sort";
    }
    String insertionSort() {

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < i+1; j++) {
                if (list[j] > list[i]) {
                    int temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                }

            }
        }

    return Arrays.toString(list)+" this is insertion sort";
    }
    String bubbleSort() {
         for(int i = 0; i < list.length-1; i++){
             for(int j = 1; j < list.length-1; j++){
                 if(list[j]<list[j-1]){
                     int temp = list[j];
                     list[j] = list[j-1];
                     list[j-1] = temp;
                 }

             }

         }
         return Arrays.toString(list)+"  this is bubblesort";
    }

}
public class Constructorspract {
    public static void main(String[] args) {
        int[] list = new int[]{4,52,2,4,2,421,23,4523,867,45,435,};
        Sorting sorting = new Sorting(list);

        System.out.println(sorting.insertionSort());
        System.out.println(sorting.bubbleSort());
        System.out.println(sorting.selectionSort());


    }
}
