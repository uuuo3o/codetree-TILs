import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];

        int maxValue = Integer.MIN_VALUE;
        int idx = n;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        while (idx != 0) {
            maxValue = -1;
            for (int i = idx - 1; i >= 0; i--) {
                if (maxValue <= array[i]) {
                    maxValue = array[i];
                    idx = i;
                }
            }
            bw.write((idx + 1) + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}