import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        String[][] matrix = new String[R][C];

        for (int i = 0; i < matrix.length; i++) {

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = st.nextToken();
            }
        }

        int result = 0;
        String nowPoint = matrix[0][0];
        String endPoint = matrix[R - 1][C - 1];

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                for (int k = i + 1; k < matrix.length - 1; k++) {
                    for (int l = j + 1; l < matrix[0].length - 1; l++) {
                        if (!matrix[0][0].equals(matrix[i][j]) &&
                            !matrix[i][j].equals(matrix[k][l]) &&
                            !matrix[k][l].equals(matrix[R - 1][C - 1])) {
                            result++;
                        }
                    }
                }
            }
        }

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}