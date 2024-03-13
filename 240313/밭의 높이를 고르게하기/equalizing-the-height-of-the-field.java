import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 밭의 개수, 원하는 밭의 높이, 원하는 연속 횟수
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        // 최초 밭의 높이를 입력받음
        int[] field = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < field.length; i++) {
            field[i] = Integer.parseInt(st.nextToken());
        }

        int minCnt = Integer.MAX_VALUE;
        for (int i = 0; i < field.length - t + 1; i++) {
            int cnt = 0;

            for (int j = i; j < i + t; j++) {
                cnt += Math.abs(field[j] - h);
            }

            minCnt = Math.min(minCnt, cnt);
        }

        bw.write(minCnt + "");

        bw.flush();
        bw.close();
        br.close();
    }
}