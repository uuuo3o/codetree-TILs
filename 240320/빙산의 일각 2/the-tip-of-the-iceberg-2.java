import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] iceberg = new int[n];

        int maxValue = 0, minValue = 1001;
        for (int i = 0; i < n; i++) {
            iceberg[i] = Integer.parseInt(br.readLine());

            maxValue = Math.max(maxValue, iceberg[i]);
            minValue = Math.min(minValue, iceberg[i]);
        }

        int maxCnt = 0;

        for (int i = 1; i < maxValue; i++) {

            boolean condition = false;
            int cnt = 0;

            for (int j = 0; j < iceberg.length; j++) {
                if (iceberg[j] > i) {
                    if (!condition) {
                        condition = true;
                        cnt++;
                    }
                } else {
                    condition = false;
                }
            }

            maxCnt = Math.max(maxCnt, cnt);
        }

        bw.write(maxCnt + "");

        bw.flush();
        bw.close();
        br.close();
    }
}