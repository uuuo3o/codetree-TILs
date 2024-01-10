import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] array = new int[2][4];

        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 가로 평균
        for (int i = 0; i < 2; i++) {
            double sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += array[i][j];
            }

            String avg = String.format("%.1f", (sum / 4));
            bw.write(avg + " ");
        }
        bw.write("\n");

        // 세로 평균
        for (int j = 0; j < 4; j++) {
            double sum = 0;
            for (int i = 0; i < 2; i++) {
                sum += array[i][j];
            }

            String avg = String.format("%.1f", (sum / 2));
            bw.write(avg + " ");
        }
        bw.write("\n");

        // 전체 평균
        double sum = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                sum += array[i][j];
            }
        }

        String avg = String.format("%.1f", (sum / 8));
        bw.write(avg + " ");

        bw.flush();
        bw.close();
        br.close();
    }
}