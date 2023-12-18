import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int prod = 1;
        for (int i = 1; i <= b; i++) {
            if (i % 4 == 0) {
                prod *= i;
            }
        }

        bw.write(prod + "");

        bw.flush();
        bw.close();
        br.close();
    }
}