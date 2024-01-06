import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double sum = 0, avg = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 8; i++) {
            sum += Double.parseDouble(st.nextToken());
        }

        avg = sum / 8;
        String avgStr = String.format("%.1f", avg);

        bw.write(avgStr);

        bw.flush();
        bw.close();
        br.close();
    }
}