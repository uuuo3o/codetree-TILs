import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        String o = st.nextToken();
        int c = Integer.parseInt(st.nextToken());

        if (o.equals("+")) {
            bw.write((a + c) + "");
        } else if (o.equals("-")) {
            bw.write((a - c) + "");
        } else if (o.equals("/")) {
            bw.write((a / c) + "");
        } else if (o.equals("*")) {
            bw.write((a * c) + "");
        } else {
            bw.write("False");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}