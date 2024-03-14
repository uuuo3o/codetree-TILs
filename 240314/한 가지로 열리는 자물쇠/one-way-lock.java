import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] key = new int[3];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < key.length; i++) {
            key[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = n * n * n;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (Math.abs(i - key[0]) > 2 &&
                        Math.abs(j - key[1]) > 2 &&
                        Math.abs(k - key[2]) > 2) {
                        cnt--;
                    }
                }
            }
        }
        
        bw.write(cnt + "");

        bw.flush();
        bw.close();
        br.close();
    }
}