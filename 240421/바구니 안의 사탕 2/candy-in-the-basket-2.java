import java.io.*;
import java.util.*;

public class Main {

    static int[] dx = new int[] {1, 1, 1, -1, -1, -1, 0, 0};
    static int[] dy = new int[] {-1, 0, 1, -1, 0, 1, -1, 1};

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][2];

        int maxNumber = 0;
        for (int i = 0; i < arr.length; i++) {

            st = new StringTokenizer(br.readLine());

            int candy = Integer.parseInt(st.nextToken());
            int basketNum = Integer.parseInt(st.nextToken());

            arr[i][0] = candy;
            arr[i][1] = basketNum;

            maxNumber = Math.max(maxNumber, basketNum);
        }

        int[] candy = new int[maxNumber + 1];
        for (int i = 0; i < arr.length; i++) {
            candy[arr[i][1]] += arr[i][0];
        }

        int maxCandy = 0;

        if (k >= candy.length) {
            for (int i = 0; i < candy.length; i++) {
                maxCandy += candy[i];
            }
        } else {
            for (int i = k; i < candy.length - k; i++) {

                int sum = 0;

                for (int j = i - k; j <= i + k; j++) {
                    sum += candy[j];
                }

                maxCandy = Math.max(maxCandy, sum);
            }

        }


        bw.write(maxCandy + "");


        bw.flush();
        bw.close();
        br.close();
    }
}