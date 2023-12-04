import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char c = br.readLine().charAt(0);
        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());

        System.out.println(c);
        System.out.printf("%.2f\n%.2f", a, b);
    }
}