import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if (cmd.equals("push")) {

                int A = Integer.parseInt(st.nextToken());

                queue.add(A);

            } else if (cmd.equals("pop")) {

                bw.write(queue.poll() + "\n");

            } else if (cmd.equals("size")) {

                bw.write(queue.size() + "\n");

            } else if (cmd.equals("empty")) {

                bw.write((queue.isEmpty() ? 1 : 0) + "\n");

            } else if (cmd.equals("front")) {

                bw.write(queue.peek() + "\n");

            }
        }

        bw.flush();
        bw.close();
        br.close();

    }
}