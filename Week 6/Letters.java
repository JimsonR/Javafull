import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Letters {
    public static void main(String[] args) {
        HashMap<Character, String[]> letters = new HashMap<>();
        letters.put('b', new Patternsstar().b());
        letters.put('i', new NewPats().i());
        letters.put('j', new Patternsstar().J());
        letters.put('m', new Patternsstar().m());
        letters.put('y', new Patternsstar().y());
        letters.put('u', new Patternsstar().u());
        letters.put('s', new Patternsstar().s());
        letters.put('e', new Patternsstar().e());
//        letters.put('x', "asd");
//        letters.put('z', "dsa");
//        System.out.print(letters.get('x'));
//        System.out.print(letters.get('z'));

//        System.out.println(letters.get('m'));
//        System.out.print(letters.get('j'));

        String s = "subbue";
        String out = "";
        for(int j = 0 ; j<10; j++){
            for(int i = 0; i<s.length(); i++){

                out += letters.get(s.charAt(i))[j]+" ";
//                System.out.print(letters.get(s.charAt(i))[j]);
            }


            out += "\n";
        }
        System.out.println(out);

//    for (Map.Entry<Character, String[]> maps : letters.entrySet()) {
//
//    }

//        System.out.println(out);

//        System.out.print(letters.get('i')[0]+" "+letters.get('j')[0]);
//        for(int i = 0 ; i< s.length(); i++){
//            out[i] = letters.get(s.charAt(i));
//        }
//        System.out.println(Arrays.toString(out));


//        for(Map.Entry<Character,String> maps : letters.entrySet()){
//            System.out.print(maps.getValue());
//
//        }

    }
}
