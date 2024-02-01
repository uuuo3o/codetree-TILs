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
        while (cnt < A.length()) {
            cnt++;
            A = A.charAt(A.length() - 1) + A.substring(0, A.length() - 1);

            if (A.equals(B)) break;
        }

        if (cnt >= A.length()) {
            bw.write(-1 + "");
        } else {
            bw.write(cnt + "");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}