import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i < n + 1; i++) {

            if (i % 2 == 0) continue;
            if (i % 10 == 5) continue;
            if ((i % 3 == 0) && (i % 9 != 0)) continue;

            bw.write(i + " ");
        }



        bw.flush();
        bw.close();
        br.close();
    }
}