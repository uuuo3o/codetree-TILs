import java.io.*;
import java.util.*;

public class Main {

    private static int idx = 0;
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringTokenizer st = new StringTokenizer(br.readLine());

        String str = br.readLine();
        String target = br.readLine();

        findIndex(str, target);

        bw.write(idx + " ");

        bw.flush();
        bw.close();
        br.close();
    }

    private static void findIndex(String str, String target) {
        boolean condition = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target.charAt(0)) {
                if (i + target.length() > str.length()) break;

                condition = true;
                idx = i + 1;

                for (int j = 1; j < target.length(); j++) {
                    if (str.charAt(idx++) != target.charAt(j)) {
                        idx = -1;
                        condition = false;
                        break;
                    }
                }

                if (condition) {
                    idx -= target.length();
                    break;
                }

            } else {
                idx = -1;
            }
        }
    }
}