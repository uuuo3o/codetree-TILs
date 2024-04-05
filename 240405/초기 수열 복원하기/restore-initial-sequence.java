import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] original = new int[n];
        int[] sumArr = new int[n - 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < sumArr.length; i++) {
            sumArr[i] = Integer.parseInt(st.nextToken());
        }

        boolean isTrue = false;
        int num = 1;
        while (num <= n) {

            int idx = 0;
            original[0] = num++;

            for (int i = 1; i <= n; i++) {

                if (idx == sumArr.length) {
                    break;
                }

                if (original[idx] != i && original[idx] + i == sumArr[idx]) {
                    original[++idx] = i;
                    i = 0;
                    isTrue = true;
                } else {
                    isTrue = false;
                }
            }

            if (isTrue) {
                break;
            }
        }

        for (int i = 0; i < original.length; i++) {
            bw.write(original[i] + " ");
        }


        bw.flush();
        bw.close();
        br.close();
    }
}