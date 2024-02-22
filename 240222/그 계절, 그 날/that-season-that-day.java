import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int Y = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        if (isExistedDay(Y, M, D)) {
            bw.write(detectSeason(M));
        } else {
            bw.write("-1");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isLeapYear(int y) {
        return y % 4 == 0 && y % 100 == 0 && y % 400 == 0;
    }

    private static int lastDayNum(int y, int m) {
        if (isLeapYear(y)) {
            if (m == 2) {
                return 29;
            }
        } else {
            return 28;
        }

        if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        }

        return 31;
    }

    private static boolean isExistedDay(int y, int m, int d) {
        int lastDayNum = lastDayNum(y, m);

        return d < lastDayNum;
    }

    private static String detectSeason(int m) {
        if (m == 12 || m == 1 || m == 2) {
            return "Winter";
        } else if (m == 3 || m == 4 || m == 5) {
            return "Spring";
        } else if (m == 6 || m == 7 || m == 8) {
            return "Summer";
        } else {
            return "Fall";
        }
    }
}