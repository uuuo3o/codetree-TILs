import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] chars = new char[10];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 10; i++) {
            chars[i] = st.nextToken().charAt(0);
        }

        bw.write( chars[1] + " " + chars[4] + " " + chars[7]);

        bw.flush();
        bw.close();
        br.close();
    }
}