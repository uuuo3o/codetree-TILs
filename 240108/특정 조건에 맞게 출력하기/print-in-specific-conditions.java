import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = new int[100];

        int i = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreElements()) {
            int num = Integer.parseInt(st.nextToken());

            if (num == 0) break;

            array[i++] = num;
        }

        for (int j = 0; j < i; j++) {
            if (array[j] % 2 == 0) {
                bw.write((array[j] / 2) + " ");
            } else {
                bw.write((array[j] + 3) + " ");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}