import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                bw.write("* ");
            } else {
                for (int j = 0; j < i + 1; j++) {
                    bw.write("* ");
                }
            }

            bw.write("\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}