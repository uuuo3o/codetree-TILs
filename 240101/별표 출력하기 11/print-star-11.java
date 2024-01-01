import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < 2 * n + 1; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 2 * n + 1; j++) {
                    bw.write("* ");
                }
            } else {
                for (int j = 0; j < n + 1; j++) {
                    bw.write("*   ");
                }
            }

            bw.write("\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}