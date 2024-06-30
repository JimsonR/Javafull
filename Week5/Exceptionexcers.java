import java.io.IOException;

public class Exceptionexcers {
    public static void main(String[] args) {
        Likers likers = new Likers();
        try{
            likers.m1();
        }catch (IOException e){

        }

    }
    void m1()throws Exception{
        System.out.println("Exceptionexcers");
        throw new IOException("asd");
    }
}
class Likers extends Exceptionexcers{
    void m1()throws IOException{
        System.out.println("Likers");
    }

}
