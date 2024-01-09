import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        while (st.hasMoreElements()) {

            int num = Integer.parseInt(st.nextToken());

            if (num == 999 || num == -999) {
                break;
            }

            if (minValue > num) {
                minValue = num;
            }
            if (maxValue < num) {
                maxValue = num;
            }
        }

        bw.write(maxValue + " " + minValue);

        bw.flush();
        bw.close();
        br.close();
    }
}