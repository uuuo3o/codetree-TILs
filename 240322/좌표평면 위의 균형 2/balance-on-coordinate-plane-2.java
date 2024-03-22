import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] inputValue = new int[n][2];

        int maxX = 0, maxY = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            inputValue[i][0] = x;
            inputValue[i][1] = y;

            maxX = Math.max(maxX, x);
            maxY = Math.max(maxY, y);
        }

        int result = n;
        for (int i = 0; i < maxX + 1; i += 2) {
            for (int j = 0; j < maxY + 1; j += 2) {

                int[] array = new int[4];

                for (int k = 0; k < n; k++) {

                    int x = inputValue[k][0];
                    int y = inputValue[k][1];

                    if (x > i && y > j) {
                        array[0]++;
                    } else if (x < i && y > j) {
                        array[1]++;
                    } else if (x < i && y < j) {
                        array[2]++;
                    } else if (x > i && y < j) {
                        array[3]++;
                    }
                }

            int maxPoint = Arrays.stream(array).max().getAsInt();

            result = Math.min(result, maxPoint);
            }
        }

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}