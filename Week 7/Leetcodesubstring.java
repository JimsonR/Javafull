import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Leetcodesubstring {
    public static void main(String[] args) {

        String s = "abcabcbb";
        System.out.println(s.compareTo("abcabcbb"));
//        int left = 0;
//        int maxLength = 0;
//        HashSet<Character> hashSet = new HashSet<>();
//        for(int right = 0; right < s.length(); right++){
//
//            while(hashSet.contains(s.charAt(right))){
//                  hashSet.remove(s.charAt(left));
//                  left++;
//            }
//            System.out.println(s.substring(left,right+1)+" "+(right+1) + " "+left);
//            hashSet.add(s.charAt(right));
//
//            maxLength = Math.max(maxLength, right - left+1);
//
//        }
//        System.out.println(maxLength);

        int maxLength = 0;

        Map<Character, Integer> charMap = new HashMap<>();

        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            if (!charMap.containsKey(s.charAt(right)) || charMap.get(s.charAt(right)) < left) {
                charMap.put(s.charAt(right), right);
                maxLength = Math.max(maxLength, right - left + 1);
            }else {
                left = charMap.get(s.charAt(right)) + 1;
                charMap.put(s.charAt(right), right);
            }
        }

        System.out.println(maxLength);

    }
    }

