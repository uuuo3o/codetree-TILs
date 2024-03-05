import java.io.*;
import java.util.*;

public class Main {

    static final int[] dx = new int[]{0, 1, -1, 0};
    static final int[] dy = new int[]{1, 0, 0, -1};

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int[][] matrix = new int[n][n];

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken()) - 1;
        int c = Integer.parseInt(st.nextToken()) - 1;
        String d = st.nextToken();

        int dirNum = getDir(d);
        for (int i = 0; i < t; i++) {
            int nowX = r + dx[dirNum], nowY = c + dy[dirNum];

            if (!isRange(nowX, nowY, matrix)) {
                dirNum = 3 - dirNum;
            } else {
                r += dx[dirNum];
                c += dy[dirNum];
            }
        }

        bw.write((r + 1) + " " + (c + 1));

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isRange(int x, int y, int[][] matrix) {
        return ((0 <= x && x < matrix.length) && (0 <= y && y < matrix.length));
    }

    private static int getDir(String direction) {
        switch (direction) {
            case "R":
                return 0;
            case "D":
                return 1;
            case "U":
                return 2;
            default:
                return 3;
        }
    }
}