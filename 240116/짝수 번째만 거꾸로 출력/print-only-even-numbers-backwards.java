import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = br.readLine();

        for (int i = str.length() - 1; i >= 0; i--) {
            if (i % 2 != 0) {
                bw.write(str.charAt(i));
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}