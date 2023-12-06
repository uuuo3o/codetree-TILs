import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        if (a % 2 != 0) {
            a += 3;
        }

        if (a % 3 == 0) {
            a /= 3;
        }

        System.out.println(a);
    }
}