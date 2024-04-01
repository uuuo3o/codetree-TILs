import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] array = new int[m][2];

        for (int i = 0; i < m; i++) {

            st = new StringTokenizer(br.readLine());

            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            array[i][0] = Math.min(num1, num2);
            array[i][1] = Math.max(num1, num2);
        }

        Arrays.sort(array, Comparator.comparingInt((int[] a) -> a[0])
                .thenComparingInt(a -> a[1]));

        int max = 0;
        int value = 1;

        for (int i = 0; i < m - 1; i++) {

            if (array[i][0] == array[i + 1][0] && array[i][1] == array[i + 1][1]) {
                value++;

            } else {
                max = Math.max(max, value);
                value = 1;
            }
        }

        max = Math.max(max, value);

        bw.write(max + "");

        bw.flush();
        bw.close();
        br.close();
    }
}