import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < n; j++) {
                if (i % j == 0 && i != j) break;
                else {
                    bw.write(i + " ");
                    break;
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}