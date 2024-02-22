import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        bw.write(isPrimeCnt(a, b) + "");

        bw.flush();
        bw.close();
        br.close();
    }

    public static int isPrimeCnt(int a, int b) {
        int sum = 0;

        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        return sum;
    }

    public static boolean isPrime(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0)
                return false;
        }
        return true;
    }
}