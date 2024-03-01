import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        final int OFFSET = 100;
        int[][] matrix = new int[201][201];

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken()) + OFFSET;
            int y = Integer.parseInt(st.nextToken()) + OFFSET;

            for (int j = x; j < x + 8; j++) {
                for (int k = y; k < y + 8; k++) {
                    if (matrix[j][k] == 0) {
                        matrix[j][k]++;
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