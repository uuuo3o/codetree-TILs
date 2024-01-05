import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int ans = 0;
        for (int i = 2; i <= n; i++) {

            int cnt = 1;
            for (int j = 2; j <= n; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }

            if (cnt == 2) {
                bw.write(i + " ");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}