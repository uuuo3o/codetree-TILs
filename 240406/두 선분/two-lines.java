import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int x3 = Integer.parseInt(st.nextToken());
        int x4 = Integer.parseInt(st.nextToken());

        int[] line = new int[Math.max(x2, x4) + 1];

        for (int i = x1; i <= x2; i++) {
            line[i]++;
        }

        for (int i = x3; i <= x4; i++) {
            line[i]++;
        }

        boolean isIntersecting = false;
        for (int i = 1; i < line.length; i++) {
            if (line[i] == 2) {
                isIntersecting = true;
                break;
            }
        }

        if (isIntersecting) {
            bw.write("intersecting");
        } else {
            bw.write("nonintersecting");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}