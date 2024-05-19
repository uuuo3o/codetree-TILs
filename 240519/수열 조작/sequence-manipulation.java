import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deque = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            deque.addLast(i);
        }

        while (deque.size() > 1) {
            deque.pollFirst();
            deque.addLast(deque.pollFirst());
        }

        bw.write(deque.peekFirst() + "\n");

        bw.flush();
        bw.close();
        br.close();

    }
}