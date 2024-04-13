import java.io.*;
import java.util.*;

public class Main {

    // 행렬로 풀이 - 동 / 남 / 서 / 북 순으로 정의
    static final int[] dx = new int[] {0, 1, 0, -1};    // 행
    static final int[] dy = new int[] {1, 0, -1, 0};    // 열
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] matrix = new int[n][n];

        int x = n - 1;
        int y = n - 1;
        matrix[x][y] = n * n;

        // 서쪽으로 시작
        int dirNum = 2;
        for (int i = n * n - 1; i >= 1; i--) {

            int nowX = x + dx[dirNum];
            int nowY = y + dy[dirNum];

            if (!inRange(nowX, nowY, matrix) || matrix[nowX][nowY] != 0) {
                dirNum = (dirNum + 1) % 4;
            }

            x += dx[dirNum];
            y += dy[dirNum];

            matrix[x][y] = i;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                bw.write(matrix[i][j] + " ");
            }
            bw.write("\n");
        }


        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean inRange(int x, int y, int[][] matrix) {
        return ((0 <= x && x < matrix.length) && (0 <= y && y < matrix[0].length));
    }
}