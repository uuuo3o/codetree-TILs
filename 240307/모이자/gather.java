import java.io.*;
import java.util.*;

public class Main {

    // {동, 남, 서, 북} 순서로 dx dy를 정의
    static final int[] dx = new int[]{0, 1, 0, -1};
    static final int[] dy = new int[]{1, 0, -1, 0};


    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {

            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += (array[j] * Math.abs(j - i));
            }

            minValue = Math.min(minValue, sum);
        }

        bw.write(minValue + "");

        bw.flush();
        bw.close();
        br.close();
    }
}