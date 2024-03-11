import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String bracket = br.readLine();

        int cnt = 0;
        for (int i = 0; i < bracket.length() - 1; i++) {
            if (bracket.charAt(i) == '(' && bracket.charAt(i + 1) == '(') {
                for (int j = i + 2; j < bracket.length() - 1; j++) {
                    if (bracket.charAt(j) == ')' && bracket.charAt(j + 1) == ')') {
                        cnt++;
                    }
                }
            }
        }

        bw.write(cnt + "");

        bw.flush();
        bw.close();
        br.close();
    }
}