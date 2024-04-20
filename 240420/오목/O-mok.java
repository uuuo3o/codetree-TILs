import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] checkerBoard = new int[20][20];

        for (int i = 1; i < checkerBoard.length; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j < checkerBoard[0].length; j++) {
                checkerBoard[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        boolean condition = false;
        int iIdx = 0, jIdx = 0;

        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                if (i < 16 && columnVictory(checkerBoard, i, j)) {
                        condition = true;
                        iIdx = i + 2;
                        jIdx = j;
                        break;
                }

                if (j < 16 && rowVictory(checkerBoard, i, j)) {
                    condition = true;
                    iIdx = i;
                    jIdx = j + 2;
                    break;
                }

                if (i >= 5 && j < 16 && diagonalVictory1(checkerBoard, i, j)) {
                    condition = true;
                    iIdx = i - 2;
                    jIdx = j + 2;
                    break;
                }

                if (i < 16 && j < 16 && diagonalVictory2(checkerBoard, i, j)) {
                    condition = true;
                    iIdx = i + 2;
                    jIdx = j + 2;
                    break;
                }
            }

            if (condition) {
                bw.write(checkerBoard[iIdx][jIdx] + "\n" + iIdx + " " + jIdx);
                break;
            }
        }

        if (!condition) {
            bw.write("0");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean rowVictory(int[][] matrix, int i, int j) {
        return (matrix[i][j] == matrix[i][j + 1] &&
                matrix[i][j + 1] == matrix[i][j + 2] &&
                matrix[i][j + 2] == matrix[i][j + 3] &&
                matrix[i][j + 3] == matrix[i][j + 4] &&
                matrix[i][j] != 0);
    }

    private static boolean columnVictory(int[][] matrix, int i, int j) {
        return (matrix[i][j] == matrix[i + 1][j] &&
                matrix[i + 1][j] == matrix[i + 2][j] &&
                matrix[i + 2][j] == matrix[i + 3][j] &&
                matrix[i + 3][j] == matrix[i + 4][j] &&
                matrix[i][j] != 0);
    }

    private static boolean diagonalVictory1(int[][] matrix, int i, int j) {
        return (matrix[i][j] == matrix[i - 1][j + 1] &&
                matrix[i - 1][j + 1] == matrix[i - 2][j + 2] &&
                matrix[i - 2][j + 2] == matrix[i - 3][j + 3] &&
                matrix[i - 3][j + 3] == matrix[i - 4][j + 4] &&
                matrix[i][j] != 0);
    }

    private static boolean diagonalVictory2(int[][] matrix, int i, int j) {
        return (matrix[i][j] == matrix[i + 1][j + 1] &&
                matrix[i + 1][j + 1] == matrix[i + 2][j + 2] &&
                matrix[i + 2][j + 2] == matrix[i + 3][j + 3] &&
                matrix[i + 3][j + 3] == matrix[i + 4][j + 4] &&
                matrix[i][j] != 0);
    }
}