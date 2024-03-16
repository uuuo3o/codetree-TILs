import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] workTime = new int[n][2];
        int maxWorkTime = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            workTime[i][0] = Integer.parseInt(st.nextToken());
            workTime[i][1] = Integer.parseInt(st.nextToken());

            maxWorkTime = Math.max(maxWorkTime, workTime[i][1]);
        }

        int maxTime = 0;
        for (int i = 0; i < n; i++) {

            int[] time = new int[maxWorkTime + 1];

            for (int j = 0; j < n; j++) {

                if (i != j) {
                    int startTime = workTime[j][0];
                    int endTime = workTime[j][1];

                    for (int k = startTime; k < endTime; k++) {
                        if (time[k] == 0) {
                            time[k]++;
                        }
                    }
                }

                int cnt = 0;
                for (int k = 0; k < time.length; k++) {
                    if (time[k] == 1) {
                        cnt++;
                    }
                }

                maxTime = Math.max(maxTime, cnt);
            }
        }

        bw.write(maxTime + "");

        bw.flush();
        bw.close();
        br.close();
    }
}