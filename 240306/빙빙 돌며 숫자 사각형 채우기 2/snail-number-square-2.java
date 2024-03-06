import java.io.*;
import java.util.*;

public class Main {

    // {동, 남, 서, 북} 순서로 dx dy를 정의
    static final int[] dx = new int[]{0, 1, 0, -1};
    static final int[] dy = new int[]{1, 0, -1, 0};


    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // N * M 행렬 생성
        int[][] matrix = new int[n][m];

        // 0행 0열에는 1이 들어감.
        int x = 0, y = 0;
        matrix[x][y] = 1;

        // 시작 방향은 남쪽
        int dirNum = 1;

        for (int i = 2; i <= n * m; i++) {
            int nowX = x + dx[dirNum];
            int nowY = y + dy[dirNum];

            // 행렬 범위에 벗어나지 않는다면, 값을 추가
            if (inRange(nowX, nowY, matrix) && matrix[nowX][nowY] == 0) {
                x = nowX; y = nowY;
                matrix[x][y] = i;
            } else {
                dirNum = (dirNum - 1 + 4) % 4;
                i--;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
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

    private static int getDir(String direction) {
        switch (direction) {
            case "E":
                return 0;
            case "S":
                return 1;
            case "W":
                return 2;
            case "N":
                return 3;
            default:
                return -1;
        }
    }
}