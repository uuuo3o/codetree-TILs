import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];

        int minValue = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            array[i] = num;
            if (minValue > num) {
                minValue = num;
            }
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == minValue) {
                cnt++;
            }
        }

        bw.write(minValue + " " + cnt);

        bw.flush();
        bw.close();
        br.close();
    }
}