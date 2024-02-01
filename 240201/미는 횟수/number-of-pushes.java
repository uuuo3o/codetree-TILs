import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = br.readLine();
        String B = br.readLine();

        int cnt = 0;
        while (cnt < B.length()) {
            cnt++;
            B = B.charAt(B.length() - 1) + B.substring(0, B.length() - 1);

            if (B.equals(A)) break;
        }

        if (cnt >= B.length()) {
            bw.write(-1 + "");
        } else {
            bw.write(cnt + "");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}