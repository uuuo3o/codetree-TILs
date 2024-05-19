import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {

            for (int i = 0; i < k - 1; i++) {
                queue.add(queue.poll());
            }
            bw.write(queue.poll() + " ");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}