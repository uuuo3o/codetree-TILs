import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int day1 = totalDays(m1, d1);

        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());
        int day2 = totalDays(m2, d2);

        bw.write(calculateDayName(day1, day2));

        bw.flush();
        bw.close();
        br.close();
    }

    private static int totalDays(int month, int day) {
        int[] days = {
                0, 31, 28, 31, 30,
                31, 30, 31, 31,
                30, 31, 30, 31
        };

        int total = 0;
        for (int i = 0; i < month; i++) {
            total += days[i];
        }

        return total + day;
    }

    private static String calculateDayName(int totalDate1, int totalDate2) {
        String[] dayNames = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int diffDate = (totalDate2 - totalDate1) % 7;
        int idx = 0;

        if (diffDate < 0) {
            idx = dayNames.length - Math.abs(diffDate);
        } else {
            idx = diffDate;
        }

        return dayNames[idx];
    }
}