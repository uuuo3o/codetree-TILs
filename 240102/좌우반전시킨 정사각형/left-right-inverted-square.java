import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                bw.write((i * j) + " ");
            }

            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}