import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());  // 수열 A의 길이
        int n2 = Integer.parseInt(st.nextToken());  // 수열 B의 길이

        int[] A = new int[n1];
        int[] B = new int[n2];

        // 수열 A, B에 값 삽입
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n1; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n2; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        // 연속부분순열일 경우 true, 아닐 경우 false
        boolean result = false;
        int idx = 0;
        for (int i = 0; i < n1; i++) {
            if (A[i] == B[idx]) {
                idx++;

                if (idx == n2) {
                    result = true;
                    break;
                }
            } else {
                idx = 0;
            }
        }

        if (result) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}