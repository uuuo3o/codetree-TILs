import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        for (int i = 1; i < a + 1; i++) {

            if ((i % 2 == 0) && (i % 4 != 0)) continue;
            if ((i / 8) % 2 == 0) continue;
            if (i % 7 < 4) continue;

            bw.write(i + " ");
        }



        bw.flush();
        bw.close();
        br.close();
    }
}