import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        final int OFFSET = 100;
        int[][] redMatrix = new int[201][201];
        int[][] blueMatrix = new int[201][201];

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken()) + OFFSET;
            int y1 = Integer.parseInt(st.nextToken()) + OFFSET;
            int x2 = Integer.parseInt(st.nextToken()) + OFFSET;
            int y2 = Integer.parseInt(st.nextToken()) + OFFSET;

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    if (i % 2 == 0) {
                        if (blueMatrix[j][k] != 0) {
                            blueMatrix[j][k] = 0;
                        }
                        redMatrix[j][k] = 1;
                    } else {
                        if (redMatrix[j][k] != 0) {
                            redMatrix[j][k] = 0;
                        }
                        blueMatrix[j][k] = 1;
                    }
                }
            }
        }


        bw.write(Arrays.stream(blueMatrix)
                .flatMapToInt(Arrays::stream)
                .sum() + "");

        bw.flush();
        bw.close();
        br.close();
    }
}