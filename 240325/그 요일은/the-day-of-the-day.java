import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        String dayName = br.readLine();

        // 각 달의 마지막 날짜
        int[] days29 = {2};
        int[] days30 = {2, 4, 6, 9, 11};
        int[] days31 = {1, 3, 5, 7, 8, 10, 12};
        String[] dayNames = {"Mon", "Tue", "Wed",
                            "Thu", "Fri", "Sat", "Sun"};

        int dayIdx = findIndex(dayNames, dayName);
        d1 += dayIdx;

        int daysCnt = 1;
        while ((m1 != m2) || (d1 != d2)) {

            d1 += 7;

            if (contains(days29, m1)) {
                if (d1 > 29) {
                    d1 -= 29;
                    m1++;
                }
            } else if (contains(days30, m1)) {
                if (d1 > 30) {
                    d1 -= 30;
                    m1++;
                }
            } else {
                if (d1 > 31) {
                    d1 -= 31;
                    m1++;
                }
            }

            if ((m1 == m2 && d1 > d2) || (m1 > m2) || m1 == 13) {
                break;
            }

            daysCnt++;
        }

        bw.write(daysCnt + "");

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean contains(int[] array, int target) {

        for (int num : array) {
            if (target == num) {
                return true;
            }
        }

        return false;
    }

    private static int findIndex(String[] array, String target) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                return i;
            }
        }

        return -1;
    }
}