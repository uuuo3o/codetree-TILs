import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 1;
        ArrayList<Integer> continuous = new ArrayList<>();
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] * array[i] < 0) {
                continuous.add(cnt);
                cnt = 0;
            }
            cnt++;
        }
        continuous.add(cnt);

        bw.write(Collections.max(continuous) + "");

        bw.flush();
        bw.close();
        br.close();
    }
}