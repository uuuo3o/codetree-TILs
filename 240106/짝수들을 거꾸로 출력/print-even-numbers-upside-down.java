import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int[] evenArr = new int[n];
        int index = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num % 2 == 0) {
                evenArr[index++] = num;
            }
        }

        for (int i = index - 1; i >= 0; i--) {
            bw.write(evenArr[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}