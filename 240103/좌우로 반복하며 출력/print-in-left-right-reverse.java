import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    bw.write((j + 1) + "");
                }
            } else {
                for (int j = 0; j < n; j++) {
                    bw.write((n - j) + "");
                }
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}