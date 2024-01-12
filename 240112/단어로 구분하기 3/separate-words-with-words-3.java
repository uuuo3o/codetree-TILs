import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 10;
        String[] strArr = new String[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            strArr[i] = st.nextToken();
        }

        for (int i = n - 1; i >= 0; i--) {
            bw.write(strArr[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}