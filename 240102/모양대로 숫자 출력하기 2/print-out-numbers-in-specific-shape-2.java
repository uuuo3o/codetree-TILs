import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int cnt = 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (cnt >= 10) {
                    cnt = 2;
                }
                bw.write(cnt + " ");
                cnt += 2;
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}