import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {

//        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(br.readLine());

        bw.write(isLeafYear(y) + "");

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isLeafYear(int y) {
        if (y % 100 == 0 && y % 400 != 0) {
            return false;
        }
        return y % 4 == 0;
    }
}