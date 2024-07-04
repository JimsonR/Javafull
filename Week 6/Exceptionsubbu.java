import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Exceptionsubbu extends Throwable {
         Exceptionsubbu (){

        }

    static void m1() throws Exception {


        System.out.println("asd");
        throw new IOException();


    }

    static {
        Integer i = 97;
        String s = String.valueOf(i);
        System.out.println();


        System.out.println("asdasd");
    }

    {

        System.out.println("asddsasssdsasdasdsasdsasdwewqwewqwrerrtefsfsdas");

    }

    public static void main(String[] args) {
        {
            System.out.println("asddsasdsasdsasdsawrqreq");
        }
        System.out.println("Outside init");


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//        Exceptionsubbu s = null;
//        s.m1();
        try {

            throw new RuntimeException();
        }
//        catch (Exception e){
//
//        }
        finally {
            System.out.println("asdsadasdasdw");
            try {
//                m1();
            } catch (Throwable e) {

            }

//        throw IOException;
        }
    }
}