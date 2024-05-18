import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        boolean isSatisfied = true;

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {

            char target = str.charAt(i);

            if (target == '(') {
                stack.push("(");
            } else {

                if (stack.isEmpty()) {
                    isSatisfied = false;
                    break;
                }

                if (stack.peek().equals("(")) {
                    stack.pop();
                }
            }
        }

        if (!stack.isEmpty()) {
            isSatisfied = false;
        }

        if (isSatisfied) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }


        bw.flush();
        bw.close();
        br.close();

    }
}