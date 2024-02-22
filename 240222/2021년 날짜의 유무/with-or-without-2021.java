import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        if (isExisted(M, D)) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isExisted(int M, int D) {

        int[] days31 = {1, 3, 5, 7, 8, 10, 12};
        int[] days30 = {4, 6, 9, 11};
        int days28 = 2;

        if (M == 2) {
            return D <= 28;
        } else if (M == 1 || M == 3 ||
                M == 5 || M == 7 ||
                M == 8 || M == 10 || M == 12) {
            return D <= 31;
        } else if (M == 4 || M == 6 ||
                M == 9 || M == 11) {
            return D <= 30;
        }

        return false;
    }
}