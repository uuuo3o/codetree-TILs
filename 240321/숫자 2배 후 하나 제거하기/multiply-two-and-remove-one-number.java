import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];

        // n개의 원소 값 넣기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            // 하나의 숫자를 2배 하기
            array[i] *= 2;

            for (int j = 0; j < n; j++) {

                // 하나의 숫자를 제거하고 남은 숫자를 담을 배열
                int[] remainingArray = new int[n - 1];
                int cnt = 0;

                for (int k = 0; k < n; k++) {
                    if (k != j) {
                        remainingArray[cnt++] = array[k];
                    }
                }

                // 인접한 숫자간의 차의 합
                int sumDiff = 0;
                for (int k = 0; k < n - 2; k++) {
                    sumDiff += Math.abs(remainingArray[k + 1] - remainingArray[k]);
                }

                // 최솟값을 구함
                minDiff = Math.min(minDiff, sumDiff);
            }

            // 다음 경우를 위해 원래의 값으로 되돌리기
            array[i] /= 2;
        }

        bw.write(minDiff + "");

        bw.flush();
        bw.close();
        br.close();
    }
}