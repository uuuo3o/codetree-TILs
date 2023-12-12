import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int sum = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        bw.write(sum + "");

        bw.flush();
        bw.close();
        br.close();
    }
}