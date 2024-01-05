import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int askii = 65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (askii > 90) {
                    askii = 65;
                }

                bw.write((char) askii++);
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}