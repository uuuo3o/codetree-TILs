import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int maxCnt = 0;
        for (int i = 0; i < arr.length; i++) {

            int cnt = 0, maxNum = 0, minNum = 10001;

            int num = arr[i];

            for (int j = 0; j < arr.length; j++) {
                if (Math.abs(num - arr[j]) <= k) {
                    maxNum = Math.max(maxNum, arr[j]);
                    minNum = Math.min(minNum, arr[j]);
                    cnt++;
                }
            }

            if (maxNum - minNum <= k) {
                maxCnt = Math.max(maxCnt, cnt);
            }
        }


        bw.write(maxCnt + "");

        bw.flush();
        bw.close();
        br.close();
    }
}