import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int[][] array = new int[n][n];

        int num = 1, col = 0;
        for (int j = (n - 1); j >= 0; j--) {
            for (int i = 0; i < n; i++) {
                if (col % 2 == 0) {
                    array[n - i - 1][j] = num++;
                } else {
                    array[i][j] = num++;
                }
            }
            col++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bw.write(array[i][j] + " ");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}