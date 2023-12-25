import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        boolean condition = false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                condition = true;
                break;
            }
        }

        if (condition) {
            bw.write("C");
        } else {
            bw.write("P");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}