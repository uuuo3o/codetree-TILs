import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int i = 0, cnt = 0;
        int sum = 0;
        for (int j = 0; j < 10; j++) {
            int num = Integer.parseInt(st.nextToken());
            if (num == 0) break;
            sum += num;
            cnt++;
        }

        String avg = String.format("%.1f", ((double) sum / cnt));

        bw.write(sum + " " + avg);
        bw.flush();
        bw.close();
        br.close();
    }
}