import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] move = new int[n];
        String[] direction = new String[n];


        int sum = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            move[i] = Integer.parseInt(st.nextToken());
            direction[i] = st.nextToken();

            sum += move[i];
        }

        int[] white = new int[sum * 2 + 1];
        int[] black = new int[sum * 2 + 1];

        String[] colors = new String[sum * 2 + 1];
        Arrays.fill(colors, "");

        int num = 0;
        int idx = sum;
        while (num < n) {

            int m = move[num];

            if (direction[num].equals("L")) {
                for (int j = 0; j < m; j++) {
                    colors[idx] = "White";
                    white[idx]++;

                    idx--;
                }
                idx++;

            } else {
                for (int j = 0; j < m; j++) {
                    colors[idx] = "Black";
                    black[idx]++;

                    idx++;
                }
                idx--;
            }

            num++;
        }

        for (int i = 0; i < white.length; i++) {
            if (white[i] >= 2 && black[i] >= 2) {
                white[i] = -1;
                black[i] = -1;
                colors[i] = "Gray";
            }
        }

        int whiteCnt = 0;
        int blackCnt = 0;
        int grayCnt = 0;
        for (int i = 0; i < colors.length; i++) {
            if (colors[i].equals("White")) {
                whiteCnt++;
            } else if (colors[i].equals("Black")) {
                blackCnt++;
            } else if (colors[i].equals("Gray")) {
                grayCnt++;
            }
        }

        bw.write(whiteCnt + " " + blackCnt + " " + grayCnt);

        bw.flush();
        bw.close();
        br.close();
    }
}