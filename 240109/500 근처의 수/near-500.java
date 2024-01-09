import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int minValue = 0;
        int maxValue = 1000;
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num < 500) {
                if (num > minValue) {
                    minValue = num;
                }
            } else {
                if (num < maxValue) {
                    maxValue = num;
                }
            }
        }

        bw.write(minValue + " " + maxValue);

        bw.flush();
        bw.close();
        br.close();
    }
}