import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = br.readLine();

        int idx = A.indexOf('e');
        A = A.substring(0, idx) + A.substring(idx + 1);

        bw.write(A);

        bw.flush();
        bw.close();
        br.close();
    }
}