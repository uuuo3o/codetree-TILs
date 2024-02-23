import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());

        bw.write(recursion(n) + "");

        bw.flush();
        bw.close();
        br.close();
    }

    private static int recursion(int num) {

        if (num == 1) {
            return 1;
        }
        if (num == 2) {
            return 2;
        }

        return (recursion(num / 3) + recursion(num - 1));
    }
}