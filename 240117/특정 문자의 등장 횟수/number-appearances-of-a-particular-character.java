import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = br.readLine();

        int eeCnt = 0, ebCnt = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.startsWith("ee", i)) {
                eeCnt++;
            }
            if (str.startsWith("eb", i)) {
                ebCnt++;
            }
        }

        bw.write(eeCnt + " " + ebCnt);

        bw.flush();
        bw.close();
        br.close();
    }
}