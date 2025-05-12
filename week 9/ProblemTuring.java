import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProblemTuring {

    public static boolean isPalindrome(String s) {
        boolean bool = true;
        int left = 0;
        int right = s.length() - 1;


        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return bool;
    }

    public static void main(String[] args) {
      String s = "parallell";
        int maxLen = 0;
        String maxString = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+maxLen; j <= s.length(); j++) {
                if(j-i > maxLen && isPalindrome(s.substring(i,j))){
                    maxLen = j-i;
                    maxString = s.substring(i,j);
                }
            }
        }
        System.out.println(maxString);

        List<Character> stream = s.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new , Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() >= 2)
                .map(Map.Entry :: getKey)
                .collect(Collectors.toList());
        System.out.println(stream);

    }
}
