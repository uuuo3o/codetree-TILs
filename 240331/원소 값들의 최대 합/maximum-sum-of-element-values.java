import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] ints = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < ints.length; i++) {
            ints[i] = Integer.parseInt(st.nextToken());
        }

        int maxSum = 0;
        for (int i = 1; i < n; i++) {
            maxSum = Math.max(maxSum, swapValue(ints, i, m));
        }

        bw.write(maxSum + "");

        bw.flush();
        bw.close();
        br.close();
    }

    private static int swapValue(int[] array, int idx, int repeat) {

        int sum = 0, index = idx, temp = 0;

        for (int i = 0; i < repeat; i++) {
            int newIdx = array[index];

            sum += newIdx;

            temp = array[newIdx];
            array[newIdx] = array[index];
            array[index] = temp;

            index = temp;
        }

        return sum;
    }
}