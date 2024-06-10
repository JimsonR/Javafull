import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.*;

public class Patterns {
    public static void main(String[] args) {
        ArrayList<String> patterns = new ArrayList<String>();
try{
      File file = new File("C:\\Users\\jimmy\\Desktop\\file.txt");
      Scanner scanner = new Scanner(file);
      while(scanner.hasNextLine()){
          scanner.nextLine();
          String ip = scanner.findInLine(Pattern.compile("^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]?[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]?[0-9])$"));
            patterns.add(ip);
          System.out.println(ip);
//          System.out.println(line);
      }

//        Scanner sc = new Scanner("C:\\Users\\jimmy\\Desktop\\file.txt");
        System.out.println(Arrays.toString(patterns.toArray()));
    }catch(FileNotFoundException e){
//    e.printStackTrace();
}
    }

}
