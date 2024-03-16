import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] matrix = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            matrix[i][0] = Integer.parseInt(st.nextToken());
            matrix[i][1] = Integer.parseInt(st.nextToken());
        }

        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    maxValue = Math.max(maxValue, getArea(matrix, i, j, k));
                }
            }
        }

        bw.write(maxValue + "");

        bw.flush();
        bw.close();
        br.close();
    }

    private static int getArea(int[][] matrix, int i, int j, int k) {
        int x1 = matrix[i][0], y1 = matrix[i][1];
        int x2 = matrix[j][0], y2 = matrix[j][1];
        int x3 = matrix[k][0], y3 = matrix[k][1];

        return Math.abs((x1 * y2 + x2 * y3 + x3 * y1) - (x2 * y1 + x3 * y2 + x1 * y3));

    }
}