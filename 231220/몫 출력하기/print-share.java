import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 0;
        while (true) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            if (n % 2 == 0) {
                cnt++;
                bw.write((n / 2) + "\n");
            }

            if (cnt == 3) break;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}