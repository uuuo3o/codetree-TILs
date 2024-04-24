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

        int minSize = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {

            int minX = 40001, minY = 40001;
            int maxX = 0, maxY = 0;

            for (int j = 0; j < n; j++) {

                if (i == j) continue;

                minX = Math.min(minX, matrix[j][0]);
                maxX = Math.max(maxX, matrix[j][0]);

                minY = Math.min(minY, matrix[j][1]);
                maxY = Math.max(maxY, matrix[j][1]);
            }

            int size = (maxX - minX) * (maxY - minY);
            minSize = Math.min(minSize, size);
        }

        bw.write(minSize + "");

        bw.flush();
        bw.close();
        br.close();
    }
}