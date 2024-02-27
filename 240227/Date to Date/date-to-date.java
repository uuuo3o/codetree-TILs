import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] days = {
                0, 31, 28, 31, 30,
                31, 30, 31, 31,
                30, 31, 30, 31
        };

        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        int startDate = 0, endDate = 0;

        for (int i = 0; i < m1; i++) {
            startDate += days[i];
        }
        startDate += d1;

        for (int i = 0; i < m2; i++) {
            endDate += days[i];
        }
        endDate += d2;

        bw.write((endDate - startDate + 1) + "");

        bw.flush();
        bw.close();
        br.close();
    }
}