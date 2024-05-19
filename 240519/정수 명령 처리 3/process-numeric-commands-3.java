import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deque = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if (cmd.equals("push_front")) {

                int a = Integer.parseInt(st.nextToken());
                deque.addFirst(a);

            } else if (cmd.equals("push_back")) {

                int a = Integer.parseInt(st.nextToken());
                deque.addLast(a);

            } else if (cmd.equals("pop_front")) {

                bw.write(deque.pollFirst() + "\n");

            } else if (cmd.equals("pop_back")) {

                bw.write(deque.pollLast() + "\n");

            } else if (cmd.equals("size")) {

                bw.write(deque.size() + "\n");

            } else if (cmd.equals("empty")) {

                bw.write((deque.isEmpty() ? 1 : 0) + "\n");

            } else if (cmd.equals("front")) {

                bw.write(deque.peekFirst() + "\n");

            } else if (cmd.equals("back")) {

                bw.write(deque.peekLast() + "\n");

            }
        }

        bw.flush();
        bw.close();
        br.close();

    }
}