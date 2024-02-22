import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (isOnjunsu(i)) {
                cnt++;
            }
        }

        bw.write(cnt + "");

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isOnjunsu(int num) {
        if (num % 2 == 0) {
            return false;
        }
        if (num % 10 == 5) {
            return false;
        }
        if ((num % 3 == 0) && (num % 9 != 0)) {
            return false;
        }

        return true;
    }
}