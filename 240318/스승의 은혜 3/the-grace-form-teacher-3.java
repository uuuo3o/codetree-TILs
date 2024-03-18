import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   // 학생의 수
        int b = Integer.parseInt(st.nextToken());   // 예산

        int[][] price = new int[n][2];   // 선물의 가격 + 배송비

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            int productPrice = Integer.parseInt(st.nextToken());
            int deliveryFee = Integer.parseInt(st.nextToken());

            price[i][0] = productPrice;
            price[i][1] = deliveryFee;
        }

        Arrays.sort(price, Comparator.comparingInt(p -> p[0]));

        int maxCnt = 0;
        for (int i = 0; i < n; i++) {

            int sum = 0, cnt = 0;

            for (int j = 0; j < n; j++) {

                if (i == j) {
                    price[i][0] /= 2;
                }

                int totalPrice = price[j][0] + price[j][1];

                if (sum + totalPrice <= b) {
                    sum += totalPrice;
                    cnt++;
                } else {
                    price[i][0] *= 2;
                    break;
                }
            }

            maxCnt = Math.max(maxCnt, cnt);
        }

        bw.write(maxCnt + "");

        bw.flush();
        bw.close();
        br.close();
    }
}