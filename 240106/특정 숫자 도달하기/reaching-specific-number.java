import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0, cnt = 0;
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num >= 250) {
                break;
            }
            sum += num;
            cnt++;
        }

        String avg = String.format("%.1f", (double) sum / cnt);
        bw.write(sum + " " + avg);

        bw.flush();
        bw.close();
        br.close();
    }
}