import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int line = 2;
        int maxX = -1001, minX = 1001,
            maxY = -1001, minY = 1001;
        int xOFFSET = 0, yOFFSET = 0;

        int[][] square = new int[line][4];

        for (int i = 0; i < line; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            square[i][0] = x1;
            square[i][1] = y1;
            square[i][2] = x2;
            square[i][3] = y2;

            maxX = Math.max(maxX, Math.max(x1, x2));
            minX = Math.min(minX, Math.min(x1, x2));
            maxY = Math.max(maxY, Math.max(y1, y2));
            minY = Math.min(minY, Math.min(y1, y2));

            xOFFSET = Math.abs(Math.min(xOFFSET, minX));
            yOFFSET = Math.abs(Math.min(yOFFSET, minY));
        }

        int[][] matrix = new int[maxX + xOFFSET + 1][maxY + yOFFSET + 1];

        for (int i = 0; i < line; i++) {

            square[i][0] += xOFFSET;
            square[i][2] += xOFFSET;

            square[i][1] += yOFFSET;
            square[i][3] += yOFFSET;
        }

        for (int i = square[0][0]; i < square[0][2]; i++) {
            for (int j = square[0][1]; j < square[0][3]; j++) {

                if (i >= square[1][0] && i < square[1][2]
                && j >= square[1][1] && j < square[1][3]) {
                    continue;
                }

                matrix[i][j] = 1;
            }
        }

        minX = maxX + xOFFSET + 1; minY = minY + yOFFSET + 1;
        maxX = 0; maxY = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    minX = Math.min(minX, i);
                    minY = Math.min(minY, j);

                    maxX = Math.max(maxX, i);
                    maxY = Math.max(maxY, j);
                }
            }
        }

        bw.write((maxX - minX + 1) * (maxY - minY) + "");

        bw.flush();
        bw.close();
        br.close();
    }
}