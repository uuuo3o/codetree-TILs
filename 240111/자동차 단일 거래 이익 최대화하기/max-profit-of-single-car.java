import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        if (n < 2) {
            bw.write(0 + " ");
        } else {
            int maxProfit = 0;
            int minPrice = array[0];

            for (int i = 1; i < n; i++) {
                int currentPrice = array[i];
                int profit = currentPrice - minPrice;
                maxProfit = Math.max(maxProfit, profit);
                minPrice = Math.min(minPrice, currentPrice);
            }

            bw.write(maxProfit + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}