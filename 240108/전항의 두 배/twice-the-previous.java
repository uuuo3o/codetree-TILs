import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = new int[10];

        StringTokenizer st = new StringTokenizer(br.readLine());
        array[0] = Integer.parseInt(st.nextToken());
        array[1] = Integer.parseInt(st.nextToken());

        for (int i = 2; i < 10; i++) {
            array[i] = array[i - 1] + (2 * array[i - 2]);
        }

        for (int i = 0; i < 10; i++) {
            bw.write(array[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}