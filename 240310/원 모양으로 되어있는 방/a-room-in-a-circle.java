import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] room = new int[n];

        int total = 0;
        for (int i = 0; i < n; i++) {
            room[i] = Integer.parseInt(br.readLine());
            total += room[i];
        }

        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {

            int cnt = 0;
            while (cnt < 5) {

                int sumDistance = 0;

                int idx = i;

                for (int j = 0; j < n; j++) {
                    sumDistance += ((room[idx++]) * j);

                    if (idx == n) {
                        idx = 0;
                    }
                }

                minValue = Math.min(minValue, sumDistance);
                cnt++;
            }


        }

        bw.write(minValue + "");

        bw.flush();
        bw.close();
        br.close();
    }
}