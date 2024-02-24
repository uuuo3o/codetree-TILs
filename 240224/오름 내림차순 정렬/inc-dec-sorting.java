import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] array = new Integer[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);
        for (Integer value : array) {
            bw.write(value + " ");
        }
        bw.write("\n");

        Arrays.sort(array, Collections.reverseOrder());
        for (Integer value : array) {
            bw.write(value + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }

}