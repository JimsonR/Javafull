import java.io.IOException;

public class Shutdown {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("shutdown -s -t 0");
        System.exit(0);

    }
}
