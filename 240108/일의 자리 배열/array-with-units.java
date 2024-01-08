import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numArr = new int[10];
        StringTokenizer st = new StringTokenizer(br.readLine());
        numArr[0] = Integer.parseInt(st.nextToken());
        numArr[1] = Integer.parseInt(st.nextToken());

        for (int i = 2; i < 10; i++) {
            int num = numArr[i - 1] + numArr[i - 2];
            if (num >= 10) {
                num -= 10;
            }

            numArr[i] = num;
        }

        for (int i = 0; i < numArr.length; i++) {
            bw.write(numArr[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}