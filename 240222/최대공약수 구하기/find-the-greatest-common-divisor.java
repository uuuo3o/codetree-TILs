import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int gcd = calculateGCD(n, m);
        bw.write(gcd + "");

        bw.flush();
        bw.close();
        br.close();
    }

    public static int calculateGCD(int n, int m) throws IOException {

        if (n < m) {
            int temp = n;
            n = m;
            m = temp;
        }

        while (m != 0) {
            int temp = n % m;
            n = m;
            m = temp;
        }

        return n;
    }
}