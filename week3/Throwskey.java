

import java.io.IOException;

class G{
    void add()throws IOException
    {
//         concat();
    }
    void concat()throws IOException{
    throw new IOException("My IOException");
    }

}
public class Throwskey {

    public static void main(String[] args) throws Throwable{
        G g = new G();
        try {
            g.add();
            ArrayIndexOutOfBoundsException arb= new ArrayIndexOutOfBoundsException("mys");
            throw arb;
        }

        catch (IOException e) {
            e.printStackTrace();
            e.getMessage();


        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            e.getMessage();
        }
        finally {
            System.out.println("done");
        }

    }
}
