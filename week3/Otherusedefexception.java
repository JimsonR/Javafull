class Rexception extends RuntimeException{
    public Rexception(String msg){
        super(msg);
    }
    public Rexception(String msg, Throwable cause){
        super(msg, cause);
    }

}
public class Otherusedefexception {
    public static void main(String[] args) {
        int b = 2020;
        throw new Rexception("Oops!");
    }
}
