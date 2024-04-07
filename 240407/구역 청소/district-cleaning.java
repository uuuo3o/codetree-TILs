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

        int[] area = new int[Math.max(b, d) + 1];

        for (int i = a; i < b; i++) {
            area[i]++;
        }
        for (int i = c; i < d; i++) {
            area[i]++;
        }

        int cleanArea = 0;
        for (int i = 1; i < area.length; i++) {
            if (area[i] >= 1) {
                cleanArea++;
            }
        }

        bw.write(cleanArea + "");

        bw.flush();
        bw.close();
        br.close();
    }
}