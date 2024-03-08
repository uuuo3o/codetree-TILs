import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder(st.nextToken());

        int maxValue = 0;
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);

            if (c == '1') {
                sb.setCharAt(i, '0');
            } else {
                sb.setCharAt(i, '1');
            }

            int decimal = Integer.parseInt(sb.toString(), 2);
            maxValue = Math.max(maxValue, decimal);

            sb.setCharAt(i, c);
        }

        bw.write(maxValue + "");

        bw.flush();
        bw.close();
        br.close();
    }
}