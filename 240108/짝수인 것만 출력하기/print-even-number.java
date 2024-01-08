import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int[] numArr = new int[n];
        int[] evenArr = new int[n];

        int j = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num % 2 == 0) {
                evenArr[j] = num;
                j++;
            }
        }

        for (int i = 0; i < j; i++) {
            bw.write(evenArr[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}