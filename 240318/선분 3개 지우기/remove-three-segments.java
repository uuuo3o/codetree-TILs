import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());   // 선분의 개수

        int[][] segments = new int[n][2];

        int maxNum = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());

            segments[i][0] = x1;
            segments[i][1] = x2;

            maxNum = Math.max(maxNum, x2);
        }

        boolean condition = true;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {

                    int[] counting = new int[maxNum + 1];

                    for (int l = 0; l < n; l++) {

                        if (l != i && l != j && l != k) {
                            int x1 = segments[l][0], x2 = segments[l][1];

                            for (int m = x1; m <= x2; m++) {
                                if (counting[m] != 0) {
                                    condition = false;
                                    break;
                                }
                                else {
                                    counting[m] = 1;
                                    condition = true;
                                }
                            }
                        }

                        if (!condition) break;
                    }

                    if (condition) {
                        cnt++;
                    }
                }
            }
        }

        bw.write(cnt + "");

        bw.flush();
        bw.close();
        br.close();
    }
}