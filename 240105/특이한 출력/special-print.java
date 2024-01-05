import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) % 4 == 0) {
                    bw.write("(" + i + ", " + j + ") " + "\n");
                } else {
                    bw.write("(" + i + ", " + j + ") ");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}