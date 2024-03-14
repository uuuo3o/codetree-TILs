import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int personNum = 6;
        int[] ability = new int[personNum];

        for (int i = 0; i < ability.length; i++) {
            ability[i] = Integer.parseInt(st.nextToken());
        }

        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < ability.length; i++) {
            for (int j = i + 1; j < ability.length; j++) {
                for (int k = j + 1; k < ability.length; k++) {
                    minValue = Math.min(minValue, getDiff(i, j, k, ability));
                }
            }
        }

        bw.write(minValue + "");

        bw.flush();
        bw.close();
        br.close();
    }

    private static int getDiff(int i, int j, int k, int[] array) {
        int sum1 = array[i] + array[j] + array[k];
        int sum2 = 0;

        for (int l = 0; l < array.length; l++) {
            sum2 += array[l];
        }

        sum2 -= sum1;

        return Math.abs(sum1 - sum2);
    }
}