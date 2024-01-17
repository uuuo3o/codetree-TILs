import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = br.readLine();

        if (str.contains("ee")) {
            bw.write("Yes ");
        } else {
            bw.write("No ");
        }

        if (str.contains("ab")) {
            bw.write("Yes ");
        } else {
            bw.write("No ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}