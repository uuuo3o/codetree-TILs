import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int cnt2 = 0, cnt3 = 0, cnt12 = 0;

        for (int i = 1; i <= n; i++) {

            if (i % 12 == 0) {
                cnt12++;
            } else if (i % 3 == 0) {
                cnt3++;
            } else if (i % 2 == 0){
                cnt2++;
            }
        }

        bw.write(cnt2 + " " + cnt3 + " " + cnt12 + " ");

        bw.flush();
        bw.close();
        br.close();
    }
}