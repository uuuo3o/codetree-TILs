import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = br.readLine();

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= '0') && str.charAt(i) <= '9') {
                sum += str.charAt(i) - 48;
            }
        }

        bw.write(sum + "");

        bw.flush();
        bw.close();
        br.close();
    }
}