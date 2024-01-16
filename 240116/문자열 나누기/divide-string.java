import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(st.nextToken());
        }

        String str = sb.toString();
        int cnt = 0;
        for (int i = 0; i < sb.length(); i++) {
            bw.write(str.charAt(i));
            cnt++;
            if (cnt == 5) {
                bw.write("\n");
                cnt = 0;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}