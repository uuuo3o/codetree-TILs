import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] array = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int maxSum = 0;


        for (int i = 0; i < n - k + 1; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += array[j];
            }
            maxSum = Math.max(sum, maxSum);
        }

        bw.write(maxSum + "");

        bw.flush();
        bw.close();
        br.close();
    }
}