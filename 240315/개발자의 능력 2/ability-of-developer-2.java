import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int personNum = 6;
        int[] ability = new int[personNum];

        int totalAbility = 0;
        for (int i = 0; i < 6; i++) {
            ability[i] = Integer.parseInt(st.nextToken());
            totalAbility += ability[i];
        }

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < ability.length; i++) {
            for (int j = i + 1; j < ability.length; j++) {
                for (int k = 0; k < ability.length; k++) {
                    for (int l = k + 1; l < ability.length; l++) {
                        int team1 = 0, team2 = 0, team3 = totalAbility;

                        if (i != k && i != l && j != k && j != l) {
                            team1 += ability[i] + ability[j];
                            team2 += ability[k] + ability[l];
                            team3 -= team1 + team2;
                        }

                        int maxSum = Math.max(team1, Math.max(team2, team3));
                        int minSum = Math.min(team1, Math.min(team2, team3));

                        minDiff = Math.min(minDiff, (maxSum - minSum));
                    }
                }
            }
        }

        bw.write(minDiff + "");

        bw.flush();
        bw.close();
        br.close();
    }
}