import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 1; i < n + 1; i++) {

            if (i % 2 == 0) continue;
            if (i % 3 == 0) continue;
            if (i % 5 == 0) continue;

            cnt++;
        }

        bw.write(cnt + "");

        bw.flush();
        bw.close();
        br.close();
    }
}