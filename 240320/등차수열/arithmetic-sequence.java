import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        int[] sequence = new int[n];

        int maxValue = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            sequence[i] = Integer.parseInt(st.nextToken());
            maxValue = Math.max(maxValue, sequence[i]);
        }

        int maxCnt = 0;
        for (int i = 1; i < maxValue; i++) {
            for (int j = 0; j < n; j++) {

                int cnt = 0;

                for (int k = i + 1; k < n; k++) {
                    if (Math.abs(sequence[j] - i) == Math.abs(i - sequence[j])) {
                        cnt++;
                    }
                }

                maxCnt = Math.max(maxCnt, cnt);
            }


        }
        
        bw.write(maxCnt + "");

        bw.flush();
        bw.close();
        br.close();
    }
}