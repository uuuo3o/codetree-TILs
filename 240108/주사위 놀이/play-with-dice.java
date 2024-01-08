import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = new int[7];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(st.nextToken());

            array[num]++;
        }

        for (int i = 1; i < 7; i++) {
            bw.write(i + " - " + array[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}