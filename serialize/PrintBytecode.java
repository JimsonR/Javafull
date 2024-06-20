import java.io.FileInputStream;
import java.io.IOException;
public class PrintBytecode {
    public static void main(String[] args) {
        try(FileInputStream fileIn = new FileInputStream("person.ser")){
            byte[] bytearray = new byte[fileIn.available()];
            fileIn.read(bytearray);
            System.out.println("Serialized object in byteCode:");
            for(byte b : bytearray){
                System.out.printf("%02x   ",b);

            }
        }catch(IOException e){
          e.printStackTrace();
        }

    }
}
