import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] strArr = new String[n];

        for (int i = 0; i < n; i++) {
            strArr[i] = br.readLine();
        }
        char c = br.readLine().charAt(0);

        int sum = 0, cnt = 0;
        for (int i = 0; i < n; i++) {
            int len = strArr[i].length();
            if (c == strArr[i].charAt(0)) {
                sum += strArr[i].length();
                cnt++;
            }
        }

        String avg = String.format("%.2f", ((double) sum / cnt));

        bw.write(cnt + " " + avg);

        bw.flush();
        bw.close();
        br.close();
    }
}