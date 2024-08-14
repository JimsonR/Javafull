public class Leetcode5 {

    public static void main(String[] args) {
        String s = "babad";

        int maxLen = 1;

        String maxStr = s.substring(0,1);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + maxLen; j <= s.length() ; j++) {
                if(j-i > maxLen && isPalindrome(s.substring(i,j))){

                    maxLen = j-i;
                    maxStr = s.substring(i,j);
//                    System.out.println(maxStr);
                }

            }

        }
        System.out.println( maxStr);

    }

    static boolean isPalindrome(String str){

        int left = 0;
        int right = str.length()-1;

        while (left < right){

            if(str.charAt(left) != str.charAt(right)){

                System.out.println(str);
                return false;

            }

            left++;
            right--;

        }

        return true;

    }
}
