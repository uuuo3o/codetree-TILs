import java.io.*;
import java.util.*;

public class Main {

    static final int[] dx = new int[]{0, 1, 0, -1};
    static final int[] dy = new int[]{1, 0, -1, 0};

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (countOnes(i, j, matrix) >= 3) {
                    result++;
                }
            }
        }

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isRange(int x, int y, int size) {
        return ((0 <= x && x < size) && (0 <= y && y < size));
    }

    private static int countOnes(int x, int y, int[][] matrix) {
        int count = 0;

        for (int dirNum = 0; dirNum < 4; dirNum++) {
            int nearX = x + dx[dirNum], nearY = y + dy[dirNum];

            if (isRange(nearX, nearY, matrix.length) && matrix[nearX][nearY] == 1) {
                count++;
            }
        }

        return count;
    }
}