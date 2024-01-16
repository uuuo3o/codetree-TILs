import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = br.readLine();
        String B = br.readLine();

        if ((A + B).equals(B + A)) {
            bw.write("true");
        } else {
            bw.write("false");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}