import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[15];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int a = arr[0];
        int b = arr[1];
        int c = 0;

        for (int i = 2; i < arr.length; i++) {
            if (a + b >= arr[i]) {
                c = arr[i];
                break;
            }
        }

        int d = arr[arr.length - 1] - a - b - c;

        bw.write(a + " " + b + " " + c + " " + d);

        bw.flush();
        bw.close();
        br.close();
    }
}