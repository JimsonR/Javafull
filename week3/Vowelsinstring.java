import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
//import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Vowelsinstring {
    public static void main(String[] args) {
        ArrayList<Character> res = new ArrayList<>();
        String s = """
                sdasdasdadassdassdassdassdasdasdasdasdasd
                asdadasdasdasdwtgsdfuihdisufhifhiuhciaughf
                qwequifyas988y8qwey9qw8eusfijfdlijhvc,xcmvbwuihro9qwrw8rf
                o8y9ueyfosifhsodifhoyeor83iuoidjfowe39urf
        
                """;
        Pattern pat = Pattern.compile("[aeiou]");
        Matcher mat = pat.matcher(s);
        while(mat.find()){
//            System.out.println(mat.group());
            res.add(mat.group().charAt(0));

        }
//        System.out.println(res[0]);
        HashSet<Character> vowels = new HashSet<>();
        HashMap<Character, Integer> vowelCount = new HashMap<>();
        int count1 = 0;
        for(Character c : res){
            vowels.add(c);
            vowelCount.put(c,count1);
            System.out.println(vowelCount);
            count1++;
        }
        System.out.println(vowelCount);

        for(int i=0; i<vowels.size(); i++){
            int count=1;
            for(int j=0; j<res.size(); j++){
                if(vowels.toArray()[i]==res.get(j)&&i!=j){
                    count++;
//                    break;
                }


            }
            System.out.println(vowels.toArray()[i]+" "+count);
}
        System.out.println(vowels);
            }


        }



