import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        double sum = 0, avg = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            sum += Double.parseDouble(st.nextToken());
        }

        avg = sum / n;
        String avgStr = String.format("%.1f", avg);
        if (avg >= 4.0) {
            bw.write(avgStr + "\nPerfect");
        } else if (avg >= 3.0) {
            bw.write(avgStr + "\nGood");
        } else {
            bw.write(avgStr + "\nPoor");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}