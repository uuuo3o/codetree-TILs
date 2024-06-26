import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] array = new int[n][2];

        for (int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }

        boolean condition = false;
        int minResult = 0;

        for (int i = 1; i <= 10000; i++) {

            int target = i;
            int k = -1;

            for (int j = 0; j < n; j++) {

                target *= 2;

                k++;
                if (target >= array[k][0] && target <= array[k][1]) {
                    condition = true;
                } else {
                    condition = false;
                    break;
                }

            }

            if (condition) {
                minResult = i;
                break;
            }
        }

        bw.write(minResult + "");

        bw.flush();
        bw.close();
        br.close();
    }
}