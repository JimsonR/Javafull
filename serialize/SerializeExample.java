import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
public class SerializeExample {
    public static void main(String[] args) {
        Person person = new Person("James", 30);
        try(FileOutputStream fileOut = new FileOutputStream("person.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut)){
            out.writeObject(person);
            System.out.println("Serialized person object is saved in file person.ser");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
