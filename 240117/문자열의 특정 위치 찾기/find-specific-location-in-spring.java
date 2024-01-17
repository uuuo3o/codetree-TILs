import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken();
        char c = st.nextToken().charAt(0);

        int idx = str.indexOf(c);
        if (idx == -1) {
            bw.write("No");
        } else {
            bw.write(idx + "");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}