import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 10;
        String[] strArr = new String[n];
        
        for (int i = 0; i < n; i++) {
            strArr[i] = br.readLine();
        }
        char c = br.readLine().charAt(0);

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int len = strArr[i].length();
            if (c == strArr[i].charAt(len - 1)) {
                bw.write(strArr[i] + "\n");
                cnt++;
            }
        }

        if (cnt == 0) {
            bw.write("None");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}