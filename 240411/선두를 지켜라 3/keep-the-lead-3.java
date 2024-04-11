import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] A = new int[10000001];
        int[] B = new int[10000001];

        int time = 1;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            for (int j = 1; j <= t; j++) {
                A[time] = A[time - 1] + v;
                time++;
            }
        }

        time = 1;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            for (int j = 1; j <= t; j++) {
                B[time] = B[time - 1] + v;
                time++;
            }
        }

        int cnt = 0;
        int leader = 0; // A가 선두면 1, B가 선두면 2, 같을 경우 3
        for (int i = 1; i < time; i++) {
            if (A[i] > B[i]) {
                if (leader != 1) {
                    cnt++;
                }
                leader = 1;

            } else if (A[i] == B[i]) {
                if (leader != 2) {
                    cnt++;
                }
                leader = 2;

            } else {
                if (leader != 3) {
                    cnt++;
                }
                leader = 3;

            }
        }

        bw.write(cnt + "");

        bw.flush();
        bw.close();
        br.close();
    }
}