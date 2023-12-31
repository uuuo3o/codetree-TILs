import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        boolean condition = false;
        for (int i = a; i < b + 1; i++) {
            if (i % c == 0) {
                condition = true;
                break;
            }
        }

        if (condition) {
            bw.write("NO");
        } else {
            bw.write("YES");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}