import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] strArr = new String[n];

        for (int i = 0; i < n; i++) {
            strArr[i] = br.readLine();
        }

        int sum = 0;
        int aCnt = 0;
        for (int i = 0; i < n; i++) {
            sum += strArr[i].length();

            if (strArr[i].charAt(0) == 'a') {
                aCnt++;
            }
        }

        bw.write(sum + " " + aCnt);

        bw.flush();
        bw.close();
        br.close();
    }
}