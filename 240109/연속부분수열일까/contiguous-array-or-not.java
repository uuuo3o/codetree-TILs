import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());  // 수열 A의 length
        int n2 = Integer.parseInt(st.nextToken());  // 수열 B의 length

        int[] A = new int[n1];  // 수열 A
        int[] B = new int[n2];  // 수열 B

        // 수열 A의 원소
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n1; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 수열 B의 원소
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n2; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        // 수열 B가 수열 A의 연속부분순열인지 판별
        int idx = 0, i = 0;
        int cnt = 0;
        if (n2 == 1) {
            for (int j = 0; j < n1; j++) {
                if (A[j] == B[0]) {
                    cnt++;
                    break;
                }
            }
        } else {
            while (i < n2) {
                if (A[idx++] == B[i]) {
                    i++;
                    cnt++;
                } else {
                    i = 0;
                    cnt = 0;
                }
            }
        }

        if (cnt == n2) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}