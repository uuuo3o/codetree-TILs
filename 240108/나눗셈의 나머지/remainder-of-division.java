import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] array = new int[b];

        int cnt = 0;
        while (a > 1) {
            array[(a % b)]++;
            a /= b;
        }

        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += (int) (Math.pow((double) array[i], 2));
        }

        bw.write(sum + "");

        bw.flush();
        bw.close();
        br.close();
    }
}