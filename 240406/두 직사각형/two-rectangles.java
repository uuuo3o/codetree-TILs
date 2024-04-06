import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] square = new int[2][4];

        for (int i = 0; i < 2; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            square[i][0] = Integer.parseInt(st.nextToken());
            square[i][1] = Integer.parseInt(st.nextToken());
            square[i][2] = Integer.parseInt(st.nextToken());
            square[i][3] = Integer.parseInt(st.nextToken());
        }

        if (isOverlapping(square)) {
            bw.write("overlapping");
        } else {
            bw.write("nonoverlapping");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isOverlapping(int[][] matrix) {

        if (matrix[0][2] < matrix[1][0] ||
            matrix[1][2] < matrix[0][0] ||
            matrix[1][3] < matrix[0][1] ||
            matrix[0][3] < matrix[1][1]) {
            return false;
        }

        return true;
    }
}