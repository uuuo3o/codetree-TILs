import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        bw.write(recursion(a * b * c) + "");

        bw.flush();
        bw.close();
        br.close();
    }

    private static int recursion(int num) {

        if (num / 10 == 0) {
            return num;
        }

        return recursion(num / 10) + num % 10;
    }
}