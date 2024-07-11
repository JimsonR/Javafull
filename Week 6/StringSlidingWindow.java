import java.util.*;

public class StringSlidingWindow {
    public static void main(String[] args) {
//        String s = "My name is Jimmy";
//
//        String match = "name";
//
//        String slide = s.substring(0,match.length());
//
//        String slide1 =""+s.charAt(0)+s.charAt(1)+s.charAt(2)+s.charAt(3);
//        System.out.println(slide1);
//
//
//
////        for(int i =0 ; i<match.length(); i++){
//
////        }
//
////        System.out.println(slide);
//        for(int i = match.length(); i<s.length(); i++){
////            System.out.println(i-3, i);
////            slide = s.substring(i-3,i+1);
////            if(match.equals(slide)){
////                System.out.println(slide +" " + (i-3) +" "+(i+1));
////                break;
////            }
//            slide1 = ""+s.charAt(i-3);
//            slide1 += ""+s.charAt(i-2);
//            slide1 += ""+s.charAt(i-1);
//            slide1 += ""+s.charAt(i) ;
//            if(match.equals(slide1)){
//                System.out.println("At index : " +(i-3) +" "+ i);
//                break;
//            }
//
//            System.out.println(slide1);

        String[] logs = {"./", "../", "./"};
        Stack<String> stack = new Stack();
//        HashSet set = new HashSet<>();
//        set.add(null);
//        set.add(null);
//        Collection ser = HashSet.newHashSet() ;
//        System.out.println(set);
        for (int j = 0; j < logs.length; j++) {
            if (logs[j].equals("../")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (logs[j].equals("./")) {

            } else {
                stack.push(logs[j]);

            }
        }
        if (!stack.isEmpty() && !stack.contains("../"))
            System.out.println(stack.size());
        else {
//            System.out.println(0);
        }

//        int i = -123;
//        int rev=0;
//        int temp=i;
//        while(temp!=0){
//           int  rem = temp % 10; // 3 -> 2 -> 1
//           rev = (rev*10) + rem;// 3 -> 32 -> 321
//           temp = temp/10; // 12-> 1 -> 0
//        }
//        System.out.println(rev);

        int [] arr = {23, 5, 12, 89, 45, 1, 78, 34, 67, 21};
//bubble sort
        for(int i = 0; i <arr.length;i++){
            for(int j = 1; j<arr.length;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]= temp;
                }
            }
        }

//        System.out.println(Arrays.toString(arr));
// selection sort
        for(int i = 0; i <arr.length;i++){
            for(int j = 1; j<arr.length-i-1;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]= temp;
                }
            }
        }
//        System.out.println(Arrays.toString(arr));
//selection sort
//        int [] arr1 = {23, 5, 12, 89, 45, 1, 78, 34, 67, 21};
       int[] nums1 = {1,2,2,1};
        int[] nums2 = {2};

        HashMap<Integer,Integer> hashMap = new HashMap<>();

//        int[] minArr = nums1.length < nums2.length ? nums1:nums2;
//
////        System.out.println(Arrays.toString(hashArr));
//        for(int i = 0; i < minArr.length; i++){
//            if(!hashMap.containsKey(minArr[i])){
//                hashMap.put(minArr[i],1 );
//            }
//            else{
//                hashMap.put(minArr[i], hashMap.get(minArr[i])+1);
//            }
//        }
//
//        System.out.println(hashMap);
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        int[] maxArr = nums1.length > nums2.length ? nums1:nums2;
//
//        for(int i = 0; i < maxArr.length; i++){
//            if(hashMap.containsKey(maxArr[i])){
//                arrayList.add(maxArr[i]);
//                System.out.println(arrayList);
//            }
//        }
//       int res[] = new int[arrayList.size()];
//        for(int i = 0; i<arrayList.size(); i++){
//            res[i] = arrayList.get(i);
//        }
//        System.out.println(Arrays.toString(res));
//
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> newList = new ArrayList<>();
        for(int i = 0 ; i< nums2.length;i++){
            arrayList.add(nums2[i]);

        }
        for(int j = 0 ; j < nums1.length;j++){
            if(arrayList.contains(nums1[j])){
                System.out.println(nums1[j]);
                newList.add(nums1[j]);
            }
        }
        int[] res = new int[newList.size()];

        for(int i = 0 ; i < newList.size() ; i++){
            res[i] = newList.get(i);
        }

        System.out.println(Arrays.toString(res));

//        String s = null;
//        System.out.println(s.length());

        Double d = 10.9;
        System.out.println(d.intValue());
        char[] c = new char[3];
        System.out.println(c[1]);
        String str1 = "hello";
        String str2 = "he" + "llo";
        System.out.println(str1 == str2);
    }
}
