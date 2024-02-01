import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        while (true) {
            String str = br.readLine();

            if (str.equals("END")) break;

            for (int i = 0; i < str.length(); i++) {
                bw.write(str.charAt(str.length() - 1 - i));
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}