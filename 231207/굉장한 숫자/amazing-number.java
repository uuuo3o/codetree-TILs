import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        boolean condOdd3 = (n % 2 == 1 && n % 3 == 0);
        boolean condEven5 = (n % 2 == 0 && n % 5 == 0);

        System.out.println(condOdd3 || condEven5 ? "true" : "false");
    }
}