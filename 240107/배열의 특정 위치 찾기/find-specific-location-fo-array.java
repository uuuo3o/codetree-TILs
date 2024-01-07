import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] ints = new int[10];
        int evenSum = 0, three = 0, cnt = 0, threeCnt = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(st.nextToken());
            cnt++;

            if (i % 2 != 0) {
                evenSum += ints[i];
            }
            if (cnt % 3 == 0) {
                three += ints[i];
                threeCnt++;
            }
        }

        String avg = String.format("%.1f", ((double) three / threeCnt));
        bw.write(evenSum + " " + avg);

        bw.flush();
        bw.close();
        br.close();
    }
}