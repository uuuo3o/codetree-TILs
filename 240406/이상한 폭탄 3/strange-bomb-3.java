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
        int k = Integer.parseInt(st.nextToken());

        int[] bombs = new int[n];
        for (int i = 0; i < bombs.length; i++) {
            bombs[i] = Integer.parseInt(br.readLine());
        }

        int result = 0, maxBomb = 0;
        for (int i = 0; i < bombs.length; i++) {

            int bomb = 0;
            int index = i;

            for (int j = i + 1; j < bombs.length; j++) {
                if (bombs[index] == bombs[j] && (index - j) <= k) {
                    bomb++;
                    index = j;
                }
            }

            if (maxBomb != Math.max(maxBomb, bomb)) {
                maxBomb = Math.max(maxBomb, bomb);
                
                if (result < bombs[i]) {
                    result = bombs[i];
                }
            };

        }

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}