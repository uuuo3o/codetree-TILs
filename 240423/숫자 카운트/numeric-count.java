import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] numArr = new int[n];
        int[][] ballCnt = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            numArr[i] = Integer.parseInt(st.nextToken());
            ballCnt[i][0] = Integer.parseInt(st.nextToken());
            ballCnt[i][1] = Integer.parseInt(st.nextToken());
        }

        int result = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {

                    if (i == j || i == k || j == k) continue;

                    boolean isSatisfied = true;

                    for (int l = 0; l < n; l++) {

                        String num = String.valueOf(numArr[l]);

                        int first = Integer.parseInt(String.valueOf(num.charAt(0)));
                        int second = Integer.parseInt(String.valueOf(num.charAt(1)));
                        int third = Integer.parseInt(String.valueOf(num.charAt(2)));

                        int sCnt = 0;
                        int bCnt = 0;

                        if (first == i) sCnt++;
                        if (second == j) sCnt++;
                        if (third == k) sCnt++;

                        if (second == i || third == i) bCnt++;
                        if (first == j || third == j) bCnt++;
                        if (first == k || second == k) bCnt++;

                        if (!(sCnt == ballCnt[l][0] && bCnt == ballCnt[l][1])) {
                            isSatisfied = false;
                            break;
                        }
                    }

                    if (isSatisfied) result++;
                }
            }
        }

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}