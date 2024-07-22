import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FMGE {
    public static void main(String[] args)throws FileNotFoundException, IOException {

//        FileReader file = new FileReader("C:\\Users\\jimmy\\Downloads\\FMGE_150_MCQs.txt");
        String filePath = "C:\\Users\\jimmy\\Downloads\\FMGE_150_MCQs.txt";

            String sr = new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8);

String[] arr = {
        "C", "C", "B", "A", "B", "B", "C", "B", "B", "A",
        "B", "A", "B", "A", "C", "B", "B", "A", "B", "C",
        "A", "A", "C", "A", "A", "C", "C", "B", "B", "B",
        "C", "C", "B", "A", "B", "B", "C", "B", "B", "A",
        "B", "A", "B", "A", "C", "B", "B", "A", "B", "C",
        "A", "A", "C", "A", "A", "C", "C", "B", "B", "B",
        "C", "C", "B", "A", "B", "B", "C", "B", "B", "A",
        "B", "A", "B", "A", "C", "B", "B", "A", "B", "C",
        "A", "A", "C", "A", "A", "C", "C", "B", "B", "B",
        "C", "C", "B", "A", "B", "B", "C", "B", "B", "A",
        "B", "A", "B", "A", "C", "B", "B", "A", "B", "C",
        "A", "A", "C", "A", "A", "C", "C", "B", "B", "B",
        "C", "C", "B", "A", "B", "B", "C", "B", "B", "A",
        "B", "A", "B", "A", "C", "B", "B", "A", "B", "C",
        "A", "A", "C", "A", "A", "C", "C", "B", "B", "B"
};
        String patternString = "(\\d+\\.\\s\\([A-Za-z\\s]+\\).+?)\\n\\s+A\\.(.+?)\\n\\s+B\\.(.+?)\\n\\s+C\\.(.+?)\\n\\s+D\\.(.+?)(?=\\n|$)";
        Pattern patterns = Pattern.compile(patternString, Pattern.DOTALL);
        Matcher matchers = patterns.matcher(sr);

        // HashMap to store the questions and options
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, String> questionsMap = new LinkedHashMap<>();
        int index = 0;
        while(matchers.find()){
            questionsMap.put(matchers.group(),arr[index]);
        index++;
        }
//        System.out.println(questionsMap);

        Iterator<String> iterator = questionsMap.keySet().iterator();
int rightAns = 0;
        while(iterator.hasNext()){

           String s = iterator.next();
            System.out.println(s);
           String ans= scanner.next();
            if(questionsMap.get(s).equals(ans)){
                rightAns++;
            }
            System.out.println(rightAns);
        }



//        System.out.println(questionsMap);

    }
}
