import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());   // 알파벳의 수
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        String[] line = new String[1001];
        for (int i = 0; i < T; i++) {

            st = new StringTokenizer(br.readLine());

            String alphabet = st.nextToken();
            int distance = Integer.parseInt(st.nextToken());

            line[distance] = alphabet;
        }

        int result = 0;
        for (int i = a; i <= b; i++) {

            int minD1 = 1000;
            int minD2 = 1000;
            for (int j = 1; j < line.length; j++) {

                if (line[j] == null) continue;

                if (line[j].equals("S")) {
                    minD1 = Math.min(minD1, Math.abs(i - j));
                }
                if (line[j].equals("N")) {
                    minD2 = Math.min(minD2, Math.abs(i - j));
                }
            }

            if (minD1 <= minD2) {
                result++;
            }
        }

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}