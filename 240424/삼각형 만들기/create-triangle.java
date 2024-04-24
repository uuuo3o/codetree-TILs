import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[][] matrix = new int[n][2];

        for (int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            matrix[i][0] = Integer.parseInt(st.nextToken());    // x
            matrix[i][1] = Integer.parseInt(st.nextToken());    // y
        }

        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int area = getArea(matrix, i, j , k);

                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        bw.write(maxArea + "");

        bw.flush();
        bw.close();
        br.close();
    }

    private static int getArea(int[][] matrix, int i, int j, int k) {

        // 삼각형 세 점의 좌표를 가지고 옴
        int x1 = matrix[i][0], y1 = matrix[i][1];
        int x2 = matrix[j][0], y2 = matrix[j][1];
        int x3 = matrix[k][0], y3 = matrix[k][1];

        int width = 0;
        int height = 0;

        if (y1 == y2 && y1 != y3) {
            width = Math.abs(x1 - x2);

            if (x1 == x3) {
                height = Math.abs(y1 - y3);
            }
            if (x2 == x3) {
                height = Math.abs(y2 - y3);
            }
        }

        if (y1 == y3 && y1 != y2) {
            width = Math.abs(x1 - x3);

            if (x1 == x2) {
                height = Math.abs(y1 - y2);
            }
            if (x3 == x2) {
                height = Math.abs(y2 - y3);
            }
        }

        if (y1 == y2 && y1 == y3) {
            return 0;
        }

        return width * height;
    }
}