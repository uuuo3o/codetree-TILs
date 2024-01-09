import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int maxValue = Integer.MIN_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (maxValue <= num) {
                maxValue = num;
            };
        }

        bw.write(maxValue + "");

        bw.flush();
        bw.close();
        br.close();
    }
}