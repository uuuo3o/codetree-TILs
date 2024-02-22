import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        bw.write(game369(a, b) + "");

        bw.flush();
        bw.close();
        br.close();
    }

    public static int game369(int a, int b) {
        int cnt = 0;

        for (int i = a; i <= b; i++) {
            if (is369Num(i)) cnt++;
        }

        return cnt;
    }

    public static boolean is369Num(int i) {
        return (i % 3 == 0) ||
                (i % 10 == 3) || (i % 10 == 6) || (i % 10 == 9) ||
                (i / 10 == 3) || (i / 10 == 6) || (i / 10 == 9);
    }
}