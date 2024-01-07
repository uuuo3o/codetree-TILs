import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int evenSum = 0, oddSum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (i % 2 == 0) {
                oddSum += num;
            } else {
                evenSum += num;
            }
        }

        bw.write((oddSum > evenSum ? (oddSum - evenSum) : (evenSum - oddSum)) + "");

        bw.flush();
        bw.close();
        br.close();
    }
}