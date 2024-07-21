public class LeetCode1 {
    public static void main(String[] args) {
        String s = "0101";
//        String r = "";
        StringBuilder stringBuilder = new StringBuilder();

        int oneCount = 0;
        int zeroCount = 0;
        char[] chars = s.toCharArray();

        for(int i = 0; i< s.length();i++){
            if(s.charAt(i) == '1'){
                oneCount++;
            }
            else{
                zeroCount++;
            }
        }
        while(oneCount-1>0){
            stringBuilder.append("1");
            oneCount--;
        }
        while(zeroCount>0){
          stringBuilder.append("0");
            zeroCount--;

       }
        stringBuilder.append("1");


        System.out.println(stringBuilder);







    }
}
