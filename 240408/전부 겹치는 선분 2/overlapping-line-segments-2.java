import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] points = new int[n][2];

        for (int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }

        if (isIntersecting(points)) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isIntersecting(int[][] matrix) {

        boolean condition = false;
        for (int i = 0; i < matrix.length; i++) {

            int maxX1 = 0;
            int minX2 = 101;

            for (int j = 0; j < matrix.length; j++) {

                if (i == j) continue;

                maxX1 = Math.max(maxX1, matrix[j][0]);
                minX2 = Math.min(minX2, matrix[j][1]);

                if (maxX1 > minX2) {
                    condition = false;
                    break;
                } else {
                    condition = true;
                }
            }

            if (condition) {
                return true;
            }
        }

        return false;
    }
}