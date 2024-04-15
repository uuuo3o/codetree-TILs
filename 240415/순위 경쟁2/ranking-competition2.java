import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int aScore = 0, bScore = 0;
        int change = 0; // 변경된 횟수
        int rank = 0;   // A일 때 1, B일 때 2, 둘 다 일 때 0
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            boolean person = st.nextToken().equals("A");
            int score = Integer.parseInt(st.nextToken());

            if (person) {
                aScore += score;
            } else {
                bScore += score;
            }

            if (aScore > bScore && rank != 1) {
                rank = 1;
                change++;
            } else if (aScore == bScore && rank != 0) {
                rank = 0;
                change++;
            } else if (aScore < bScore && rank != 2) {
                rank = 2;
                change++;
            }
        }

        bw.write(change + "");

        bw.flush();
        bw.close();
        br.close();
    }
}