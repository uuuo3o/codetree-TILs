import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] numArr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        int result = getLCM2(numArr, 0);
        bw.write(result + "");


        bw.flush();
        bw.close();
        br.close();
    }

    private static int getGCD(int a, int b) {

        if (b == 0) {
            return a;
        }

        return getGCD(b, a % b);
    }

    private static int getLCM(int a, int b) {
        return (a * b) / getGCD(a, b);
    }

    private static int getLCM2(int[] numbers, int index) {

        if (index == numbers.length - 1) {
            return numbers[index];
        }

        return getLCM(numbers[index], getLCM2(numbers, index + 1));
    }
}