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

        int[] aTime = new int[n];
        int[] aDirection = new int[n];
        int aLength = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int time = Integer.parseInt(st.nextToken());
            int direction = st.nextToken().equals("R") ? 1 : -1;

            aTime[i] = time;
            aDirection[i] = direction;

            aLength += time;
        }

        int[] bTime = new int[m];
        int[] bDirection = new int[m];
        int bLength = 0;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int time = Integer.parseInt(st.nextToken());
            int direction = st.nextToken().equals("R") ? 1 : -1;

            bTime[i] = time;
            bDirection[i] = direction;

            bLength += time;
        }

        int maxLength = Math.max(aLength, bLength);

        int[] aMove = new int[maxLength + 1];
        int[] bMove = new int[maxLength + 1];

        int aIdx = 0;
        for (int i = 0; i < n; i++) {
            int time = aTime[i];
            int direction = aDirection[i];

            for (int j = 0; j < time; j++) {
                aMove[aIdx + 1] = aMove[aIdx++] + direction;
            }
        }

        int bIdx = 0;
        for (int i = 0; i < m; i++) {
            int time = bTime[i];
            int direction = bDirection[i];

            for (int j = 0; j < time; j++) {
                bMove[bIdx + 1] = bMove[bIdx++] + direction;
            }
        }

        if (maxLength == aLength) {
            int lastPosition = bMove[bLength];

            for (int i = bLength; i < aLength + 1; i++) {
                bMove[i] = lastPosition;
            }
        } else {
            int lastPosition = aMove[aLength];

            for (int i = aLength; i < bLength + 1; i++) {
                aMove[i] = lastPosition;
            }
        }

        int cnt = 0;
        for (int i = 1; i <= Math.max(aLength, bLength); i++) {
            if ((aMove[i] == bMove[i]) &&
                aMove[i - 1] != bMove[i - 1]) {
                cnt++;
            }
        }

        bw.write(cnt + "");

        bw.flush();
        bw.close();
        br.close();
    }
}