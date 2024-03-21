import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] sell = new int[n + 1][3];
        boolean[] isExist = new boolean[n + 1];


        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            sell[i][0] = a;
            sell[i][1] = b;
            sell[i][2] = c;
        }

        int maxCnt = 0;
        for (int i = 1; i <= 3; i++) {

            int cnt = 0;
            isExist[i] = true;

            for (int j = 1; j <= n; j++) {



                int a = sell[j][0];
                int b = sell[j][1];
                int c = sell[j][2];

                boolean temp = isExist[a];
                isExist[a] = isExist[b];
                isExist[b] = temp;

                if (isExist[c]) {
                    cnt++;
                }
            }

            isExist[i] = false;
            
            maxCnt = Math.max(maxCnt, cnt);
        }

        bw.write(maxCnt + "");

        bw.flush();
        bw.close();
        br.close();
    }
}