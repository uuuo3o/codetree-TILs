import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] charArr = new char[10];
        for (int i = 0; i < 10; i++) {
            charArr[i] = st.nextToken().charAt(0);
        }
        for (int i = 9; i >= 0; i--) {
            bw.write(charArr[i]);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}