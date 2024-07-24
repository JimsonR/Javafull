import java.util.HashMap;

public class Leetcode290 {
    public static void main(String[] args) {
       String pattern = "abba";
       String s = "dog cat cat fish";
        HashMap<Character,String> character = new HashMap<>();
      String[] ars = s.split(" ");
      boolean b = false;
       for(int i = 0; i<pattern.length();i++){
           if(character.containsKey(pattern.charAt(i))) {

               if(!ars[i].equals(character.get(pattern.charAt(i)))){

                   b =false;
                   break;
               }else {
                   character.put(pattern.charAt(i), ars[i]);
                   b = true;
               }
           }
           else {
               character.put(pattern.charAt(i), ars[i]);


           }
       }

        System.out.println(b);

    }

}
