import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] line = new int[n][2];

        for (int i = 0; i < line.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            line[i][0] = Integer.parseInt(st.nextToken());
            line[i][1] = Integer.parseInt(st.nextToken());
        }

        int minLength = 100;
        for (int i = 0; i < line.length; i++) {

            int minX = 101;
            int maxX = 0;

            for (int j = 0; j < line.length; j++) {

                if (i == j) continue;

                minX = Math.min(minX, line[j][0]);
                maxX = Math.max(maxX, line[j][1]);
            }

            minLength = Math.min(minLength, maxX - minX);
        }

        bw.write(minLength + "");

        bw.flush();
        bw.close();
        br.close();
    }
}