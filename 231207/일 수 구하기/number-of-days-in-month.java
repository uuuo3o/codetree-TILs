import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int month = Integer.parseInt(br.readLine());

        int[] array31 = {1, 3, 5, 7, 8, 10, 12};
        
        if (month == 2) {
            System.out.println(28);
        } else if (Arrays.stream(array31).anyMatch(number -> number == month)) {
            System.out.println(31);
        } else {
            System.out.println(30);
        }
    }
}