import java.io.*;
import java.util.*;

public class Main {

    static int[] dx = new int[] {1, 1, 1, -1, -1, -1, 0, 0};
    static int[] dy = new int[] {-1, 0, 1, -1, 0, 1, -1, 1};

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String[] sign = new String[101];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int position = Integer.parseInt(st.nextToken());
            String alphabet = st.nextToken();

            sign[position] = alphabet;
        }

        int maxLength = 0;
        for (int i = 0; i < sign.length; i++) {

            int gCnt = 0;
            int hCnt = 0;

            if (sign[i] == null) continue;

            if (sign[i].equals("G")) gCnt++;
            else hCnt++;

            for (int j = i + 1; j < sign.length; j++) {

                if (sign[j] == null) continue;

                if (sign[j].equals("G")) gCnt++;
                else hCnt++;

                if (gCnt == hCnt || gCnt == 0 || hCnt == 0) {
                    maxLength = Math.max(maxLength, j - i);
                }
            }
        }

        bw.write(maxLength + "");

        bw.flush();
        bw.close();
        br.close();
    }
}