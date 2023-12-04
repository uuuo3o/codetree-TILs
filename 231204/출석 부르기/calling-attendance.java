import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n == 1) {
            System.out.println("John");
        } else if (n == 2) {
            System.out.println("Tom");
        } else if (n == 3) {
            System.out.println("Paul");
        } else {
            System.out.println("Vacancy");
        }
    }
}