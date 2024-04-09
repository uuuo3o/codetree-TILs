import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] distanceA = new int[1000000];
        int time = 0, nowPosition = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            for (int j = 0; j < t; j++) {
                nowPosition += v;
                distanceA[time++] = nowPosition;
            }
        }

        int[] distanceB = new int[1000000];
        time = 0; nowPosition = 0;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            for (int j = 0; j < t; j++) {
                nowPosition += v;
                distanceB[time++] = nowPosition;
            }
        }

        int cnt = 0;
        int now = 0;
        for (int i = 0; i < time; i++) {

            int isChange = distanceA[i] - distanceB[i];

            if (isChange < 0 && ((-1) * now < 0)) {
                cnt++;
            } else if (isChange > 0 && now < 0) {
                cnt++;
            }

            if (isChange != 0) {
                now = isChange;
            }
        }

        bw.write(cnt + "");

        bw.flush();
        bw.close();
        br.close();
    }
}