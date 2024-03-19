import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   // 장비의 개수
        int c = Integer.parseInt(st.nextToken());   // 온도에 따른 작업량
        int g = Integer.parseInt(st.nextToken());   // 온도에 따른 작업량
        int h = Integer.parseInt(st.nextToken());   // 온도에 따른 작업량

        int[][] temp = new int[n][2];

        int minWorkTime = 0, maxWorkTime = 0;
        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            int tempA = Integer.parseInt(st.nextToken());
            int tempB = Integer.parseInt(st.nextToken());

            temp[i][0] = tempA;
            temp[i][1] = tempB;

            minWorkTime = Math.min(minWorkTime, tempA);
            maxWorkTime = Math.max(maxWorkTime, tempB);
        }

        int maxWork = 0;
        for (int i = minWorkTime - 1; i <= maxWorkTime + 1; i++) {
            
            int work = 0;

            for (int j = 0; j < n; j++) {

                if (i < temp[j][0]) {
                    work += c;
                } else if (i <= temp[j][1]) {
                    work += g;
                } else {
                    work += h;
                }
            }

            maxWork = Math.max(work, maxWork);
        }

        bw.write(maxWork + "");

        bw.flush();
        bw.close();
        br.close();
    }

}