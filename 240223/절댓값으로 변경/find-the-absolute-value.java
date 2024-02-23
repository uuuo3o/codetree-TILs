import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        absValue(array);
        for (int value : array) {
            bw.write(value + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static void absValue(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(arr[i]);
        }
    }
}