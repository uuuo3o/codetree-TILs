import java.io.*;
import java.util.*;

public class Main {

    private static int idx1 = 0, idx2 = 0, sum;
    private static int[] A;
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        A = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            idx1 = Integer.parseInt(st.nextToken());
            idx2 = Integer.parseInt(st.nextToken());

            add();
            bw.write(sum + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static void add() {
        sum = 0;
        for (int i = idx1 - 1; i < idx2; i++) {
            sum += A[i];
        }
    }
}