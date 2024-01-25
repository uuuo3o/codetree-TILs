import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = br.readLine();
        char[] request = br.readLine().toCharArray();

        for (int i = 0; i < request.length; i++) {
            if (request[i] == 'L') {
                A = A.substring(1) + A.charAt(0);
            } else if (request[i] == 'R') {
                A = A.substring(A.length() - 1) + A.substring(0, A.length() - 1);
            }
        }

        bw.write(A);

        bw.flush();
        bw.close();
        br.close();
    }
}