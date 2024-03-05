import java.io.*;
import java.util.*;

public class Main {

    // {동, 남, 서, 북} 순서로 dx dy를 정의
    static final int[] dx = new int[]{1, 0, -1, 0};
    static final int[] dy = new int[]{0, -1, 0, 1};


    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // N * N 행렬 생성
        int[][] matrix = new int[n][n];

        // M개의 줄에 걸쳐 색칠할 칸의 위치를 주어줌.
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            
            // 2차원 배열에다 넣을거니까 -1해서 인덱스 맞춰주기
            int r = Integer.parseInt(st.nextToken()) - 1;
            int c = Integer.parseInt(st.nextToken()) - 1;

            matrix[r][c] = 1;

            // 해당 위치가 편안한 상태라면
            if (isComfortable(r, c, matrix)) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean inRange(int x, int y, int[][] matrix) {
        return ((0 <= x && x < matrix.length) && (0 <= y && y < matrix[0].length));
    }

    private static boolean isComfortable(int x, int y, int[][] matrix) {
        int count = 0;

        for (int i = 0; i < 4; i++) {
            int nowX = x + dx[i];
            int nowY = y + dy[i];
            if (inRange(nowX, nowY, matrix) && matrix[nowX][nowY] == 1) {
                count++;
            }
        }

        return count == 3;
    }
}