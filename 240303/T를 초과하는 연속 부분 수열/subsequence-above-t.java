import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int[] array = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        ArrayList<Integer> continuous = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= t) {
                continuous.add(cnt);
                cnt = 0;
            } else {
                cnt++;
            }
        }

        continuous.add(cnt);
        bw.write(Collections.max(continuous) + "");

        bw.flush();
        bw.close();
        br.close();
    }
}