import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] intArr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < intArr.length; i++) {
            if (i % 2 == 0) {
                if (i == 0) {
                    bw.write(intArr[i] + " ");
                } else {
                    int[] middleArr = new int[i + 1];
                    for (int j = 0; j < i + 1; j++) {
                        middleArr[j] = intArr[j];
                    }
                    Arrays.sort(middleArr);
                    bw.write(middleArr[i / 2] + " ");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}