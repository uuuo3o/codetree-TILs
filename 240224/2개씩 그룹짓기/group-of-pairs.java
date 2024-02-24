import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] A = new int[2 * n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            if (maxSum <= (A[i] + A[A.length - 1 - i])) {
                maxSum = A[i] + A[A.length - 1 - i];
            }
        }

        bw.write(maxSum + "");

        bw.flush();
        bw.close();
        br.close();
    }
}