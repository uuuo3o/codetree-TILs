import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 개발자 수
        int K = Integer.parseInt(st.nextToken());   // 전염될 악수 횟수
        int P = Integer.parseInt(st.nextToken());   // 최초 전염된 개발자 번호
        int T = Integer.parseInt(st.nextToken());   // 총 악수 횟수

        // 전염된 개발자는 1, 전염되지 않은 개발자는 0
        int[][] developers = new int[N + 1][2];
        boolean[] infection = new boolean[N + 1];
        developers[P][0] = 1;
        developers[P][1] = K;
        infection[P] = true;

        int[][] handshake = new int[T][3];
        for (int i = 0; i < T; i++) {

            st = new StringTokenizer(br.readLine());

            int time = Integer.parseInt(st.nextToken());
            handshake[i][0] = time;
            handshake[i][1] = Integer.parseInt(st.nextToken());
            handshake[i][2] = Integer.parseInt(st.nextToken());
        }

        // 악수한 시간 순으로 정렬
        Arrays.sort(handshake, Comparator.comparingInt(arr -> arr[0]));

        for (int i = 0; i < T; i++) {
            int x = handshake[i][1];
            int y = handshake[i][2];

            // 악수한 개발자 중 한 명 이상이라도 감염이 되어있고, 전염횟수가 남아있는 경우
            if ((developers[x][0] == 1 && developers[x][1] > 0) ||
                (developers[y][0] == 1 && developers[y][1] > 0)) {
                
                developers[x][0] = 1;
                developers[y][0] = 1;

                if (infection[x]) {
                    developers[x][1]--;
                } else {
                    developers[x][1] = K;
                    infection[x] = true;
                }

                if (infection[y]) {
                    developers[y][1]--;
                } else {
                    developers[y][1] = K;
                    infection[y] = true;
                }
            }
        }


        for (int i = 1; i < developers.length; i++) {
            bw.write(developers[i][0] + "");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}