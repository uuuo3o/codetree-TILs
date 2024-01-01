import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                bw.write((i * j) + " ");
            }

            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}