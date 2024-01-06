import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] intArr = new int[10];

        int i = 0, num = 1, cnt = 0;
        for (int j = 0; j < 10; j++) {
            num = Integer.parseInt(st.nextToken());
            if (num == 0) break;
            intArr[j] = num;
            cnt++;
        }

        for (int j = 0; j < cnt; j++) {
            bw.write(intArr[cnt - j - 1] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}