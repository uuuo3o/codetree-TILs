import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] picture = new int[10001];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int position = Integer.parseInt(st.nextToken());
            char sign = st.nextToken().charAt(0);

            if (sign == 'G') {
                picture[position] = 1;
            } else {
                picture[position] = 2;
            }

        }

        int maxSum = Integer.MIN_VALUE;
        for (int i = 1; i < picture.length - k; i++) {
            int sum = 0;

            for (int j = i; j < i + k + 1; j++) {
                sum += picture[j];
            }

            maxSum = Math.max(maxSum, sum);
        }

        bw.write(maxSum + "");

        bw.flush();
        bw.close();
        br.close();
    }
}