import java.io.*;
import java.util.*;

public class Main {

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

        int maxCnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 2; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n - 2; l++) {
                        if (i != k || j == l + 3) {
                            int sum = (matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2])
                                    + (matrix[k][l] + matrix[k][l + 1] + matrix[k][l + 2]);

                            maxCnt = Math.max(maxCnt, sum);
                        }
                    }
                }
            }
        }

        bw.write(maxCnt + "");

        bw.flush();
        bw.close();
        br.close();
    }
}