import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int[] ints = new int[15];
        int cnt = 0, i = 0, j = 1;
        while (cnt < 2) {
            int num = n * (j++);
            ints[i++] = num;
            if (num % 5 == 0) {
                cnt++;
            }
        }

        for (int k = 0; k < i; k++) {
            bw.write(ints[k] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}