import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());    // 명령의 수

        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < N; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            String cmd = st.nextToken();
            int A;

            if (cmd.equals("push_front")) {
                A = Integer.parseInt(st.nextToken());

                // 정수 A를 연결 리스트의 앞에 넣습니다.
                linkedList.addFirst(A);

            } else if (cmd.equals("push_back")) {
                A = Integer.parseInt(st.nextToken());

                // 정수 A를 연결 리스트의 뒤에 넣습니다.
                linkedList.addLast(A);

            } else if (cmd.equals("pop_front")) {
                // 연결 리스트의 가장 앞에 있는 수를 빼고, 그 수를 출력합니다.
                bw.write(linkedList.pollFirst() + "\n");

            } else if (cmd.equals("pop_back")) {
                // 연결 리스트의 가장 뒤에 있는 수를 빼고, 그 수를 출력합니다.
                bw.write(linkedList.pollLast() + "\n");

            } else if (cmd.equals("size")) {
                // 연결 리스트에 들어있는 정수의 개수를 출력합니다.
                bw.write(linkedList.size() + "\n");

            } else if (cmd.equals("empty")) {
                // 연결 리스트가 비어있으면 1을, 아니면 0을 출력합니다.
                bw.write((linkedList.isEmpty() ? 1 : 0) + "\n");

            } else if (cmd.equals("front")) {
                // 연결 리스트의 가장 앞에 있는 정수를 출력합니다.
                bw.write(linkedList.peekFirst() + "\n");

            } else if (cmd.equals("back")) {
                // 연결 리스트의 가장 뒤에 있는 정수를 출력합니다.
                bw.write(linkedList.peekLast() + "\n");

            }

        }

        bw.flush();
        bw.close();
        br.close();

    }
}