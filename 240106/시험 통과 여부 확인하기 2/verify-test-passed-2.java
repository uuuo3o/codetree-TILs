import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            double sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += Double.parseDouble(st.nextToken());
            }

            if ((sum / 4) >= 60) {
                bw.write("pass\n");
                cnt++;
            } else {
                bw.write("fail\n");
            }
        }

        bw.write(cnt + "");

        bw.flush();
        bw.close();
        br.close();
    }
}