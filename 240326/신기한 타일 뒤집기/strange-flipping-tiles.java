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
        Arrays.fill(colors, "Gray");

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

        int whiteCnt = 0;
        int blackCnt = 0;
        for (String color : colors) {
            if (color.equals("White")) {
                whiteCnt++;
            } else if (color.equals("Black")) {
                blackCnt++;
            }
        }

        bw.write(whiteCnt + " " + blackCnt + " ");

        bw.flush();
        bw.close();
        br.close();
    }
}