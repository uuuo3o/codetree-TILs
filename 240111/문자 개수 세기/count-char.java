import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        char c = br.readLine().charAt(0);

        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                cnt++;
            }
        }

        bw.write(cnt + "");

        bw.flush();
        bw.close();
        br.close();
    }
}