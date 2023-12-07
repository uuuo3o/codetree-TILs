import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int midExam = Integer.parseInt(st.nextToken());
        int finalExam = Integer.parseInt(st.nextToken());

        if (midExam < 90 || finalExam < 90) {
            System.out.println(0);
        } else if (finalExam >= 95) {
            System.out.println(100000);
        } else {
            System.out.println(50000);
        }
    }
}