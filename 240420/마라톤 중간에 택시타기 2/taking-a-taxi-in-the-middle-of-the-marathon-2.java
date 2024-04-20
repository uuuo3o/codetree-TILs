import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] checkPoints = new int[n][2];

        for (int i = 0; i < checkPoints.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            checkPoints[i][0] = Integer.parseInt(st.nextToken());
            checkPoints[i][1] = Integer.parseInt(st.nextToken());
        }

        int minDistance = Integer.MAX_VALUE;
        for (int i = 1; i < checkPoints.length - 1; i++) {

            int distance = 0;
            int[][] newCheckPoints = new int[n - 1][2];
            int idx = 0;

            for (int j = 0; j < checkPoints.length; j++) {

                if (i == j) continue;

                newCheckPoints[idx][0] = checkPoints[j][0];
                newCheckPoints[idx++][1] = checkPoints[j][1];
            }

            for (int j = 0; j < newCheckPoints.length - 1; j++) {
                int dx = Math.abs(newCheckPoints[j][0] - newCheckPoints[j + 1][0]);
                int dy = Math.abs(newCheckPoints[j][1] - newCheckPoints[j + 1][1]);
                distance += (dx + dy);
            }

            minDistance = Math.min(minDistance, distance);
        }

        bw.write(minDistance + "");

        bw.flush();
        bw.close();
        br.close();
    }
}