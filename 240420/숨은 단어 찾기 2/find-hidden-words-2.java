import java.io.*;
import java.util.*;

public class Main {

    static int[] dx = new int[] {1, 1, 1, -1, -1, -1, 0, 0};
    static int[] dy = new int[] {-1, 0, 1, -1, 0, 1, -1, 1};

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] matrix = new char[n][m];

        // 입력
        for (int i = 0; i < n; i++) {

            String str = br.readLine();

            for (int j = 0; j < m; j++) {
                matrix[i][j] = str.charAt(j);
            }
        }

        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] != 'L') continue;

                for (int k = 0; k < dx.length; k++) {
                    int strCnt = 1;
                    int nowX = i;
                    int nowY = j;

                    while (true) {
                        int nx = nowX + dx[k];
                        int ny = nowY + dy[k];

                        if (!inRange(matrix, nx, ny)) break;

                        if (matrix[nx][ny] != 'E') break;

                        strCnt++;
                        nowX = nx;
                        nowY = ny;

                        if (strCnt == 3) {
                            result++;
                            break;
                        }
                    }
                }
            }
        }

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean inRange(char[][] matrix, int x, int y) {
        return 0 <= x && x < matrix.length && 0 <= y && y < matrix[0].length;
    }
}