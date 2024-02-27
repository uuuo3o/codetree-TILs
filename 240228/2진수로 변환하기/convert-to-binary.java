import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        bw.write(decimalToBinary(n));

        bw.flush();
        bw.close();
        br.close();
    }

    private static String decimalToBinary(int number) {
        int[] digits = new int[20];
        int cnt = 0;

        while (true) {
            if (number < 2) {
                digits[cnt++] = number;
                break;
            }

            digits[cnt++] = number % 2;
            number /= 2;
        }

        StringBuilder result = new StringBuilder();
        for (int i = cnt - 1; i >= 0; i--) {
            result.append(digits[i]);
        }

        return result.toString();
    }
}