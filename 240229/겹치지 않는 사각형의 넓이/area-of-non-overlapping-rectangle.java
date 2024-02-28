import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        final int OFFSET = 1000;
        int[][] matrix = new int[2001][2001];


        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken()) + OFFSET;
            int y1 = Integer.parseInt(st.nextToken()) + OFFSET;
            int x2 = Integer.parseInt(st.nextToken()) + OFFSET;
            int y2 = Integer.parseInt(st.nextToken()) + OFFSET;

            if (i != 2) {
                for (int j = x1; j < x2; j++) {
                    for (int k = y1; k < y2; k++) {
                        matrix[j][k]++;
                    }
                }
            } else {
                for (int j = x1; j < x2; j++) {
                    for (int k = y1; k < y2; k++) {
                        if (matrix[j][k] == 1) {
                            matrix[j][k]--;
                        }
                    }
                }
            }
        }


        bw.write(Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .sum() + "");

        bw.flush();
        bw.close();
        br.close();
    }
}