import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   // 학생 수
        int b = Integer.parseInt(st.nextToken());   // 예산

        // 학생이 원하는 선물의 가격을 저장할 배열
        int[] p = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(br.readLine());
        }

        // 배열 정렬
        Arrays.sort(p);

        int maxCnt = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0, sumCnt = 0;

            for (int j = 0; j < n; j++) {

                if (i == j) {
                    p[i] /= 2;
                }

                if (sum + p[j] <= b) {
                    sum += p[j];
                    sumCnt++;
                } else {
                    p[i] *= 2;
                    break;
                }
            }

            maxCnt = Math.max(maxCnt, sumCnt);
        }

        bw.write(maxCnt + "");

        bw.flush();
        bw.close();
        br.close();
    }
}