import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int cleanArea = 0;
        if (isIntersecting(a, b, c, d)) {
            cleanArea = (Math.max(b, d) - Math.min(a, c));
        } else {
            cleanArea = (b - a) + (d - c);
        }

        bw.write(cleanArea + "");

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isIntersecting(int x1, int x2, int x3, int x4) {
        return x2 >= x3 && x1 <= x4;
    }
}