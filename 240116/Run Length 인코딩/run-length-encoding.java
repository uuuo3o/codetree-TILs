import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = br.readLine();

        char c = str.charAt(0);
        int cnt = 0;

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (c != str.charAt(i)) {
                result.append(c).append(cnt);
                c = str.charAt(i);
                cnt = 1;
            } else {
                cnt++;
            }

            if (i == str.length() - 1) {
                result.append(c).append(cnt);
            }
        }

        bw.write(result.length() + "\n" + result);

        bw.flush();
        bw.close();
        br.close();
    }
}