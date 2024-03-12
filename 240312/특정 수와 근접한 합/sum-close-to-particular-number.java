import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int[] array = new int[n];
        int totalSum = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
            totalSum += array[i];
        }

        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int twoSum = array[i] + array[j];
                int minus = totalSum - twoSum;

                minValue = Math.min(minValue, Math.abs(s - minus));
            }
        }

        bw.write(minValue + "");

        bw.flush();
        bw.close();
        br.close();
    }
}