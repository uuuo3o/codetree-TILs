import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            String cmd = st.nextToken();

            if (cmd.equals("push")) {

                int A = Integer.parseInt(st.nextToken());
                stack.push(A);

            } else if (cmd.equals("pop")) {
                
                bw.write(stack.pop() + "\n");

            } else if (cmd.equals("size")) {

                bw.write(stack.size() + "\n");

            } else if (cmd.equals("empty")) {

                bw.write((stack.isEmpty() ? 1 : 0)+ "\n");

            } else if (cmd.equals("top")) {

                bw.write(stack.peek() + "\n");

            }
        }

        bw.flush();
        bw.close();
        br.close();

    }
}