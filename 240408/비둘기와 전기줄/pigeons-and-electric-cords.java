import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // (번호) 비둘기 - 왼쪽(0)/오른쪽(1)
        int[][] birdPosition = new int[n][2];

        for (int i = 0; i < birdPosition.length; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            birdPosition[i][0] = Integer.parseInt(st.nextToken());
            birdPosition[i][1] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for (int i = 0; i < birdPosition.length; i++) {
            for (int j = i + 1; j < birdPosition.length; j++) {

                // 같은 비둘기가 아니면 확인할 필요가 없음.
                if (birdPosition[i][0] != birdPosition[j][0]) {
                    continue;
                }

                // 같은 비둘기가 같은 위치에 있으면 이동했다고 판단할 수 없음.
                if (birdPosition[i][1] == birdPosition[j][1]) {
                    break;
                }

                count++;
                break;
            }
        }

        bw.write(count + "");

        bw.flush();
        bw.close();
        br.close();
    }
}