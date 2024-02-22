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
            if ((i % 3 == 0) || contains369(i)) cnt++;
        }

        return cnt;
    }

    public static boolean contains369(int i) {
        String numStr = String.valueOf(i);
        return numStr.contains(String.valueOf(3)) ||
                numStr.contains(String.valueOf(6)) ||
                numStr.contains(String.valueOf(9));
    }
}