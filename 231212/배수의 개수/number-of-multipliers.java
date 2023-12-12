import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int count3 = 0;
        int count5 = 0;

        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            if (num % 3 == 0 && num % 5 == 0) {
                count3++;
                count5++;
            } else {
                if (num % 3 == 0) {
                    count3++;
                } else if (num % 5 == 0) {
                    count5++;
                }
            }
        }

        bw.write(count3 + " " + count5);

        bw.flush();
        bw.close();
        br.close();
    }
}