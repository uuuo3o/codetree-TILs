import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = br.readLine();
        int L = A.length();

        bw.write(A + "\n");
        for (int i = 0; i < A.length(); i++) {
            A = A.substring(L - 1) + A.substring(0, L - 1);
            bw.write(A + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}