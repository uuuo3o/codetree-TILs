import java.io.*;
import java.util.*;

public class Main {

    static final int[] dx = new int[]{0, 1, 0, -1};
    static final int[] dy = new int[]{1, 0, -1, 0};
    static int x = 0, y = 0;


    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        int result = 0;
        boolean satisfied = false;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String d = st.nextToken();
            int dirNum = getDir(d);
            int t = Integer.parseInt(st.nextToken());

            for (int j = 0; j < t; j++) {
                x += dx[dirNum];
                y += dy[dirNum];

                result++;

                if (x == 0 && y == 0) {
                    satisfied = true;
                    break;
                }
            }

            if (satisfied) {
                break;
            }
        }

        if (satisfied) {
            bw.write(result + "");
        } else {
            bw.write(-1 + "");
        }



        bw.flush();
        bw.close();
        br.close();
    }

    private static int go(int x, int y, int dirNum, int time) {
        int result = 0;
        for (int i = 0; i < time; i++) {
            x += dx[dirNum];
            y += dy[dirNum];

            result++;

            if (x == 0 && y == 0) {
                return result;
            }
        }
        return time;
    }

    private static boolean inRange(int x, int y, int[][] matrix) {
        return ((0 <= x && x < matrix.length) && (0 <= y && y < matrix[0].length));
    }

    private static int getDir(String direction) {
        switch (direction) {
            case "E":
                return 0;
            case "S":
                return 1;
            case "W":
                return 2;
            case "N":
                return 3;
            default:
                return -1;
        }
    }
}