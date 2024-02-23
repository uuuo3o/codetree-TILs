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

        bw.write(recursion(array, n - 1) + "");

        bw.flush();
        bw.close();
        br.close();
    }

    private static int recursion(int[] arr, int idx) {
        if (idx < 1) {
            return 0;
        }

        return Math.max(recursion(arr, idx - 1), arr[idx]);
    }
}