import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] ttt = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String line = br.readLine();

            ttt[i][0] = Integer.parseInt(String.valueOf(line.charAt(0)));
            ttt[i][1] = Integer.parseInt(String.valueOf(line.charAt(1)));
            ttt[i][2] = Integer.parseInt(String.valueOf(line.charAt(2)));
        }

        int result = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (horizonVic(ttt, i, j) ||
                    verticalVic(ttt, i, j) ||
                    middleVic(ttt, i, j)) {
                    result++;
                }
            }
        }

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean horizonVic(int[][] matrix, int col, int row) {
        if (row != 0) return false;

        int firstNum = matrix[col][row];
        int secondNum = matrix[col][row + 1];
        int thirdNum = matrix[col][row + 2];

        return (firstNum == secondNum && firstNum != thirdNum) ||
                (firstNum == thirdNum && firstNum != secondNum) ||
                (secondNum == thirdNum && secondNum != firstNum);
    }

    private static boolean verticalVic(int[][] matrix, int col, int row) {

        if (col != 0) return false;

        int firstNum = matrix[col][row];
        int secondNum = matrix[col + 1][row];
        int thirdNum = matrix[col + 2][row];

        return (firstNum == secondNum && firstNum != thirdNum) ||
                (firstNum == thirdNum && firstNum != secondNum) ||
                (secondNum == thirdNum && secondNum != firstNum);
    }

    private static boolean middleVic(int[][] matrix, int col, int row) {

        if (col != 1 || row != 1) return false;

        int firstNum = matrix[col - 1][row - 1];
        int secondNum = matrix[col][row];
        int thirdNum = matrix[col + 1][row + 1];

        if ((firstNum == secondNum && firstNum != thirdNum) ||
            (firstNum == thirdNum && firstNum != secondNum) ||
            (secondNum == thirdNum && secondNum != firstNum)) {
            return true;
        }

        firstNum = matrix[col - 1][row + 1];
        thirdNum = matrix[col + 1][row - 1];

        return (firstNum == secondNum && firstNum != thirdNum) ||
                (firstNum == thirdNum && firstNum != secondNum) ||
                (secondNum == thirdNum && secondNum != firstNum);
    }
}