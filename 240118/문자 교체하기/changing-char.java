import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        String newStr = A.substring(0, 2) + B.substring(2);
        bw.write(newStr);

        bw.flush();
        bw.close();
        br.close();
    }
}