import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] array = new int[100];
        array[0] = 1;
        array[1] = n;

        int i = 2, num = 0;
        while (num < 100) {

            num = array[i - 1] + array[i - 2];
            array[i++] = num;
        }

        for (int j = 0; j < i; j++) {
            bw.write(array[j] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}