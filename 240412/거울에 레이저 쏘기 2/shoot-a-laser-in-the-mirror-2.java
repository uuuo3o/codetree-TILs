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
        char[][] matrix = new char[n][n];

        // 거울 값 넣기
        for (int i = 0; i < matrix.length; i++) {
            String str = br.readLine();
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = str.charAt(j);
            }
        }

        // 레이저 쏘는 위치
        int laser = Integer.parseInt(br.readLine());

        int x = 0, y = 0, dirNum = 0;

        if (laser != 1) {
            for (int i = 2; i <= 4 * n; i++) {
                int nowX = x + dx[dirNum], nowY = y + dy[dirNum];

                if (!inRange(nowX, nowY, matrix)) {
                    dirNum = (dirNum + 1) % 4;

                    if (i == laser) {
                        break;
                    }

                    continue;
                }

                x += dx[dirNum];
                y += dy[dirNum];

                if (i == laser) {
                    break;
                }
            }
        }

        // 레이저를 쏘는 방향 재설정
        dirNum = (dirNum + 1) % 4;
        int result = 0;
        while (inRange(x, y, matrix)) {

            if (matrix[x][y] == '/') {
                if (dirNum == 0 || dirNum == 2) {
                    dirNum = (dirNum + 3) % 4;
                } else {
                    dirNum = (dirNum + 1) % 4;
                }
            } else {
                if (dirNum == 0 || dirNum == 2) {
                    dirNum = (dirNum + 1) % 4;
                } else {
                    dirNum = (dirNum + 3) % 4;
                }
            }

            x += dx[dirNum];
            y += dy[dirNum];
            result++;
        }

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean inRange(int x, int y, char[][] matrix) {
        return ((0 <= x && x < matrix.length) && (0 <= y && y < matrix[0].length));
    }
}