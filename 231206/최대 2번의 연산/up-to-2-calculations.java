import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        if (a % 2 == 0) {
            a /= 2;
        }

        if (a % 2 != 0) {
            a += 1;
            a /= 2;
        }

        System.out.println(a);
    }
}