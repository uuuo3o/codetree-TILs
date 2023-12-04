import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n >= 100) {
            System.out.println("vapor");
        } else if (n < 0) {
            System.out.println("ice");
        } else {
            System.out.println("water");
        }
    }
}