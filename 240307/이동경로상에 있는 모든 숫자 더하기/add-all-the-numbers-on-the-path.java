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
        int t = Integer.parseInt(st.nextToken());

        // N * N 행렬 생성
        int[][] matrix = new int[n][n];

        // 명령을 담은 문자열
        String command = br.readLine();

        // 행렬에 값 넣기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 시작지점은 가운데
        int mid = n / 2;
        int x = mid, y = mid;

        // 시작방향은 북쪽
        int dirNum = 3;

        int sum = matrix[x][y];
        for (int i = 0; i < command.length(); i++) {
            char cmd = command.charAt(i);

            int nowX = x + dx[dirNum];
            int nowY = y + dy[dirNum];

            if (cmd == 'F' && inRange(nowX, nowY, matrix)) {
                x = nowX;
                y = nowY;

                sum += matrix[x][y];
            }

            if (cmd == 'L') {
                dirNum = (dirNum - 1 + 4) % 4;
            } else if (cmd == 'R') {
                dirNum = (dirNum + 1) % 4;
            }
        }

        bw.write(sum + "");

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean inRange(int x, int y, int[][] matrix) {
        return ((0 <= x && x < matrix.length) && (0 <= y && y < matrix.length));
    }
}