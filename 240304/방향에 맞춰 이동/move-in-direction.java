import java.io.*;
import java.util.*;

public class Main {

    static final int[] dx = new int[]{1, -1, 0, 0};
    static final int[] dy = new int[]{0, 0, -1, 1};

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int nowX = 0, nowY = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String direction = st.nextToken();
            int distance = Integer.parseInt(st.nextToken());

            switch (direction) {
                case "E":
                    nowX = nowX + dx[0] * distance;
                    nowY = nowY + dy[0] * distance;
                    break;
                case "W":
                    nowX = nowX + dx[1] * distance;
                    nowY = nowY + dy[1] * distance;
                    break;
                case "S":
                    nowX = nowX + dx[2] * distance;
                    nowY = nowY + dy[2] * distance;
                    break;
                case "N":
                    nowX = nowX + dx[3] * distance;
                    nowY = nowY + dy[3] * distance;
                    break;
                default:
                    break;
            }
        }

        bw.write(nowX + " " + nowY);

        bw.flush();
        bw.close();
        br.close();
    }
}