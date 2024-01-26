import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = br.readLine();
        String B = br.readLine();

        StringBuilder newA = new StringBuilder();
        StringBuilder newB = new StringBuilder();

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) >= '0' && A.charAt(i) <= '9') {
                newA.append(A.charAt(i));
            }
        }

        for (int i = 0; i < B.length(); i++) {
            if (B.charAt(i) >= '0' && B.charAt(i) <= '9') {
                newB.append(B.charAt(i));
            }
        }

        int intA = Integer.parseInt(newA.toString());
        int intB = Integer.parseInt(newB.toString());

        bw.write((intA + intB) + "");

        bw.flush();
        bw.close();
        br.close();
    }
}