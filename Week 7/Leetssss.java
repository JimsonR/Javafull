import java.util.*;

public class Leetssss {
    static Integer var = 2;


    static void thrice (Integer vars){

       var = vars*3;

    }

    public static void main(String[] args) {

//        System.out.println(var);
//        thrice(var);
//        System.out.println(var);

        int[][] matrix = {{3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}};
//       int[][] matrix ={{7,8},{1,2}};
//        int i = 0;
//        int j = 1;
//        int small = matrix[0][0];
//      while(i< matrix.length){
//          System.out.println(matrix[i][(j-1)%matrix.length]);
//          if (j%matrix.length==0) {
//              i++;
//          }
//
//          j++;
//
//      }

//        List<Integer> rowMin = new ArrayList<>();
//        for (int i = 0; i < matrix.length; i++) {
//            int rMin = Integer.MAX_VALUE;
//            for (int j = 0; j < matrix[0].length; j++) {
//
//                rMin = Math.min(rMin, matrix[i][j]);
//
//            }
//            rowMin.add(rMin);
//        }
//        System.out.println(rowMin);
//
//
//
//    List<Integer> colMax = new ArrayList<>();
//        for(int i = 0; i<matrix.length;i++) {
//
//        int cMax = Integer.MIN_VALUE;
//        for (int j = 0; j < matrix[0].length; j++) {
//
//            cMax = Math.max(cMax, matrix[j][i]);
//
//        }
//        colMax.add(cMax);
//    }
//        System.out.println(colMax);
//
//        List<Integer> luckyNumbers = new ArrayList<>();
//        for (int i = 0; i < matrix.length; i++) {
//
//            for (int j = 0; j < matrix[0].length; j++) {
//                if(matrix[i][j] == rowMin.get(i) && matrix[i][j] == colMax.get(j)){
//                luckyNumbers.add(matrix[i][j]);
//                }
//
//
//            }
//
//        }
//        System.out.println(luckyNumbers);
         int[] arr = {1,2,3,4,3,4,5};

         List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
         for(int p = 0; p< arr.length; p++){
             if(!list.contains(arr[p])){

                 list.add(arr[p]);

             }
             else{


             }

         }
//        System.out.println(list1);

//                int[] arr ={1,2,3,4,3,4,5,4};
//                HashSet<Integer> hashSet = new HashSet<>();
//                HashSet<Integer> hashSet1 = new HashSet<>();
//                for (int i = 0; i < arr.length ; i++) {
//                    if (hashSet.add(arr[i])) {
//                    } else {
//
//                        if(hashSet1.contains(arr[i])){
//                     System.out.println(arr[i]);
////                     list1.add(arr[p]);
//                 }
//                 else{
//                    hashSet1.add(arr[i]);
//                 }
//                    }
//
//                }
//
//        System.out.println(hashSet1);

//        HashMap<Integer,Integer> count = new HashMap<>();
//
//        for(int l = 0 ; l< arr.length; l++){
//            if(!count.containsKey(arr[l])){
//                count.put(arr[l],1);
//            }
//            else{
//                count.put(arr[l], count.get(arr[l])+1);
//            }
//        }
//        System.out.println(count);
//
//        for(Map.Entry<Integer,Integer> maps: count.entrySet()){
//            if(maps.getValue()==2){
//                System.out.println(maps.getKey());
//            }
//        }


        for (int i = 0; i <arr.length ; i++) {
            int count =1;
            for (int j = i; j <arr.length ; j++) {
                if(arr[i]==arr[j] && i!=j){
                    count++;
//                    System.out.println(arr[i]);
                }
            }
            if (count==2){
                System.out.println(arr[i]);
            }

        }
        System.out.println((100+10)*(6-4)-8-1);

      int[][]  grid = {{1,3},{2,2}};
      int index = 1;
        for (int g = 0; g < grid.length; g++) {
            int count = 1;
            for (int i = 0; i < grid[0].length; i++) {
//                if(grid[i]){
//
//                }
            }
        }

}




}




