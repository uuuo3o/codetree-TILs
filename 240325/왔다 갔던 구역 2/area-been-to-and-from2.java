import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] move = new int[n];
        String[] direction = new String[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            move[i] = Integer.parseInt(st.nextToken());
            direction[i] = st.nextToken();

            sum += move[i];
        }

        int[] line = new int[sum * 2 + 1];

        int num = 0;
        int idx = sum;
        while (num < n) {

            int m = move[num];

            if (direction[num].equals("L")) {
                for (int j = 0; j < m; j++) {
                    line[--idx]++;
                }
            } else {
                for (int j = 0; j < m; j++) {
                    line[idx++]++;
                }
            }

            num++;
        }

        int cnt = 0;
        for (int i = 0; i < line.length; i++) {
            if (line[i] > 1) {
                cnt++;
            }
        }

        bw.write(cnt + "");

        bw.flush();
        bw.close();
        br.close();
    }
}