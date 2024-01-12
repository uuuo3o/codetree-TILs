import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = 10;
        
        String[] strArr = new String[n];
        for (int i = 0; i < n; i++) {
            strArr[i] = st.nextToken();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += strArr[i].length();
        }
        
        bw.write(sum + "");

        bw.flush();
        bw.close();
        br.close();
    }
}