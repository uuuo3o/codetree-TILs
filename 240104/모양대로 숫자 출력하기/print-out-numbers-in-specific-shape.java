import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                bw.write("  ");
            }
            for (int j = n; j > i; j--) {
                bw.write((j - i) + " ");
            }

            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}