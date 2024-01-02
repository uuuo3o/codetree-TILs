import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int cnt = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (cnt < 1) {
                    cnt = 9;
                }
                bw.write(cnt-- + "");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}