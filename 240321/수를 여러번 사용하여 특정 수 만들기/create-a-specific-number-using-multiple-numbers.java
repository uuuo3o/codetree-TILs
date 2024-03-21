import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int maxNum = 0;
        for (int i = 0; i < (c / a) + 1; i++) {
            for (int j = 0; j < (c / b) + 1; j++) {

                int sum = (a * i) + (b * j);

                if (sum <= c) {
                    maxNum = Math.max(maxNum, sum);
                }
            }
        }

        bw.write(maxNum + "");

        bw.flush();
        bw.close();
        br.close();
    }
}