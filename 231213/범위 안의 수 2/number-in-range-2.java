import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0, cnt = 0;
        for (int i = 0; i < 10; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            if (num >= 0 && num <= 200) {
                sum += num;
                cnt++;
            }
        }

        double avg = (double) sum / cnt;

        System.out.printf("%d %.1f", sum, avg);

        bw.flush();
        bw.close();
        br.close();
    }
}