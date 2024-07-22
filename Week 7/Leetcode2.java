import java.util.Arrays;

public class Leetcode2 {

    public static void main(String[] args) {
    int[] seats = {12,14,19,19,12};
    int[] students = {19,2,17,20,7};
        Arrays.sort(seats);
        Arrays.sort(students);
        int moves = 0;
        System.out.println(Arrays.toString(seats));
        System.out.println(Arrays.toString(students));
   for(int i = 0; i< seats.length;i++){
//       if(seats[i] != seats[(i+1)%seats.length]){
           moves += Math.abs(students[i] - seats[(i+1)%seats.length]);
//       }

   }

        System.out.println(moves);

    }


}
