import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = new int[10];

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreElements()) {
            int num = Integer.parseInt(st.nextToken());
            if (num == 0) break;

            array[(num / 10)]++;
        }

        for (int i = 1; i < 10; i++) {
            bw.write(i + " - " + array[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}