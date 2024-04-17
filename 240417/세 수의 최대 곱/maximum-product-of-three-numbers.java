import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        bw.write(Math.max(arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3],
                            arr[0] * arr[1] * arr[arr.length - 1]) + "");

        bw.flush();
        bw.close();
        br.close();
    }
}