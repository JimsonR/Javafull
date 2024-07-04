import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args)throws FileNotFoundException, IOException {
        Scanner scan = new Scanner(System.in);

//        String s = scan.nextLine();
//
//        String[] sarr = s.split("m");
//        System.out.println(Arrays.toString(sarr));
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        String s1 = "JDSFAS Dasdsd gregd";
//       String[] strings= s.split(" ");
//        System.out.println(Arrays.toString(Arrays.toString(strings).split(",")));

        FileReader file = new FileReader("C:\\Users\\jimmy\\Desktop\\file.txt");

        System.out.println(file.read());


//        for(int i = 0 ; i< 5; i++){
//            int input = scan.nextInt();
//            arrayList.add(input);
//
//        }

//        System.out.println(arrayList);



    }
}
