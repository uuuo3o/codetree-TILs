import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = br.readLine();
        String B = br.readLine();

        while (A.contains(B)) {

            int idx = A.indexOf(B);
            A = A.substring(0, idx) + A.substring(idx + B.length());
        }

        bw.write(A);

        bw.flush();
        bw.close();
        br.close();
    }
}