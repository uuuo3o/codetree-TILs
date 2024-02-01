import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = 0;
        while (true) {
            String str = br.readLine();
            if (str.equals("0")) break;

            cnt++;

            if (cnt % 2 != 0) {
                bw.write(str + "\n");
            }
        }

        System.out.println(cnt);
        bw.flush();
        bw.close();
        br.close();
    }
}