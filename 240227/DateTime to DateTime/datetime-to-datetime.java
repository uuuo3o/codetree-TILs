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

        int day = Integer.parseInt(st.nextToken());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        int startTime = 11 * 24 * 60 + 11 * 60 + 11;
        int endTime = day * 24 * 60 + (hour * 60 + minute);

        if (endTime - startTime < 0) {
            bw.write("-1");
        } else {
            bw.write(endTime - startTime + "");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}