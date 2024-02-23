import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String A = br.readLine();

        // StringTokenizer st = new StringTokenizer(br.readLine());

        if (detectAlphabet(A)) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean detectAlphabet(String str) {
        char target = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (target != str.charAt(i)) {
                return true;
            }
        }

        return false;
    }
}