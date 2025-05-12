import java.util.Iterator;
import java.util.stream.IntStream;

public class Leetcode678 {
    public boolean checkValidString(String s){
        return oneway(')',s, ()-> IntStream.range(0,s.length()).iterator()) &&
                oneway('(', s , ()->IntStream.range(0,s.length()).map(i-> s.length()-1-i).iterator());
    }

    public boolean oneway(char closingChar , String s , Iterable<Integer> indices){
        int openCount = 0;
        for(int i : indices){
            if(s.charAt(i) == closingChar){
                System.out.println(s.charAt(i));
                openCount--;
                if(openCount < 0){

                    return false;

                }}else {
                    openCount++;
                }
            }

        return true;
    }
    public static void main(String[] args) {
        String s = "()";
        System.out.println(new Leetcode678().checkValidString(s));


    }
}
