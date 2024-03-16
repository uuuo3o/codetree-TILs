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

        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int x1 = matrix[i][0], y1 = matrix[i][1];
                int x2 = matrix[j][0], y2 = matrix[j][1];

                int value = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);

                minValue = Math.min(minValue, value);
            }
        }

        bw.write(minValue + "");

        bw.flush();
        bw.close();
        br.close();
    }
}