import java.io.*;
import java.util.*;

public class Main {

    private static int n, m, sum = 0;
    private static int[] A;
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        A = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        calculate(m);
        bw.write(sum + "");

        bw.flush();
        bw.close();
        br.close();
    }

    private static void calculate(int num) {
        while (num != 0) {
            sum += A[num - 1];

            if (num % 2 != 0) {
                num -= 1;
            } else {
                num /= 2;
            }
        }
    }
}