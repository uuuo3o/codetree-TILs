import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < n - 2; i++) {
            int sum = 0;

            for (int j = i + 2; j < n; j++) {
                sum = array[i] + array[j];
                maxValue = Math.max(maxValue, sum);
            }
        }

        bw.write(maxValue + "");

        bw.flush();
        bw.close();
        br.close();
    }
}