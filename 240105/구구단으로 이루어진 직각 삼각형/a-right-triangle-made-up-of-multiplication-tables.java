import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                bw.write((n - i + 1) + " * " + j + " = " + ((n - i + 1) * j));

                if (j == i) {
                    bw.write("\n");
                } else {
                    bw.write(" / ");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}