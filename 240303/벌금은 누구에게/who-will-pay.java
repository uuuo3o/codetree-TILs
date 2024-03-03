import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] penalty = new int[n + 1];
        int fine = -1;
        for (int i = 0; i < m; i++) {
            int number = Integer.parseInt(br.readLine());
            penalty[number]++;

            if (penalty[number] == k) {
                fine = number;
                break;
            }
        }

        bw.write(fine + "");

        bw.flush();
        bw.close();
        br.close();
    }
}