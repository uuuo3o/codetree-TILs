import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   // 폭탄의 개수
        int k = Integer.parseInt(st.nextToken());   // 특정 거리

        int[] bomb = new int[n];

        for (int i = 0; i < n; i++) {
            bomb[i] = Integer.parseInt(br.readLine());
        }

        // 같은 번호가 부여된 폭탄끼리의 거리가 k 안에 있다면 폭발
        // 터지는 폭탄이 없으면 -1 출력

        int maxNum = -1;
        for (int i = 0; i < n; i++) {

            int bombNum = bomb[i];

            for (int j = i + 1; j < n; j++) {
                if (bombNum == bomb[j] && Math.abs(j - i) <= k) {
                    maxNum = Math.max(maxNum, bomb[j]);
                }
            }
        }

        bw.write(maxNum + "");

        bw.flush();
        bw.close();
        br.close();
    }
}