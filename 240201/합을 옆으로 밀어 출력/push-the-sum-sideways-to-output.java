import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(br.readLine());
        }

        String sumStr = Integer.toString(sum);
        sumStr = sumStr.substring(1) + sumStr.charAt(0);

        bw.write(sumStr);

        bw.flush();
        bw.close();
        br.close();
    }
}