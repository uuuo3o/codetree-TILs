import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0, i = 1;
        while (n > 1) {

            n /= i;
            i++;
            cnt++;
        }

        bw.write(cnt + "");

        bw.flush();
        bw.close();
        br.close();
    }
}