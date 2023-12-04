import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double a = Double.parseDouble(br.readLine());
        
        if (a >= 1.0) {
            System.out.println("High");
        } else if (a >= 0.5) {
            System.out.println("Middle");
        } else {
            System.out.println("Low");
        }
    }
}