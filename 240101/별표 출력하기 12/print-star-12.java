import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String str = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    if (i == 0) {
                        bw.write("* ");
                    } else {
                        bw.write("  ");
                    }
                } else {
                    if (j >= i) {
                        bw.write("* ");
                    } else {
                        bw.write("  ");
                    }
                }
            }

            bw.write("\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}