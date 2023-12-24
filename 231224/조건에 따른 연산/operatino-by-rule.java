import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;

        while (true) {

            if (n % 2 == 0) {
                n = n * 3 + 1;
                cnt++;
            } else {
                n = n * 2 + 2;
                cnt++;
            }

            if (n >= 1000) {
                break;
            }
        }

        bw.write(cnt + "");

        bw.flush();
        bw.close();
        br.close();
    }
}