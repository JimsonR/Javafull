public class Leetcode5 {
  static boolean isPalindrome(String s){
      boolean bool = true;
      int left = 0;
      int right = s.length()-1;

      while(left < right){
          if(s.charAt(left) != s.charAt(right)){
              return false;
          }

          left++;
          right--;

      }

       return  bool;
   }

    public static void main(String[] args) {
        String s = "parallell";

        int maxLen = 1;

        String maxStr = s.substring(0,1);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + maxLen ; j <= s.length(); j++) {
                if( j-i >= maxLen && isPalindrome(s.substring(i,j))){
                    maxLen = j-i;
                    maxStr = s.substring(i,j);

                }
            }
        }
        System.out.println(maxStr);


    }
}
