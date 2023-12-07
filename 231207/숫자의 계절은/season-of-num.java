import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int month = Integer.parseInt(br.readLine());

        if (month < 3 || month == 12) {
            System.out.println("Winter");
        } else if (month < 6) {
            System.out.println("Spring");
        } else if (month < 9) {
            System.out.println("Summer");
        } else if (month < 12) {
            System.out.println("Winter");
        }
    }
}