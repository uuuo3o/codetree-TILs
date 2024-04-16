import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int change = 0; // 명예의 전당 조합이 바뀐 횟수
        int aScore = 0, bScore = 0, cScore = 0; // 각 학생의 점수
        

        int nowWinner = 0;  // 현재 명예의 전당에 있는 사람
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int point = Integer.parseInt(st.nextToken());


            if (name.equals("A")) {
                aScore += point;
            } else if (name.equals("B")) {
                bScore += point;
            } else {
                cScore += point;
            }

            int state = status(aScore, bScore, cScore);
            if (nowWinner != state) {
                nowWinner = state;
                change++;
            }
        }

        bw.write(change + "");

        bw.flush();
        bw.close();
        br.close();
    }

    // 0: A, B, C
    // 1: A / 2: B / 3: C
    // 4: A, B / 5: A, C / 6: B, C
    private static int status(int score1, int score2, int score3) {
        if (score1 < score2 && score1 < score3) {
            if (score2 < score3) return 3;
            else if (score2 == score3) return 6;
            else return 2;
        } else if (score2 < score1 && score2 < score3) {
            if (score1 < score3) return 3;
            else if (score1 == score3) return 5;
            else return 1;
        } else if (score3 < score1 && score3 < score2) {
            if (score1 < score2) return 2;
            else if (score1 == score2) return 4;
            else return 1;
        } else return 0;
    }
}