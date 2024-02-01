import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(br.readLine());

        String nStr = Integer.toString(n);
        int sum = 0;
        for (int i = 0; i < nStr.length(); i++) {
            sum += Integer.parseInt(String.valueOf(nStr.charAt(i)));
        }

        bw.write(sum + "");

        bw.flush();
        bw.close();
        br.close();
    }
}