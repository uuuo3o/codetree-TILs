import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   // 처음 식빵의 개수
        int m = Integer.parseInt(st.nextToken());   // 명령의 수
        LinkedList<Character> bread = new LinkedList<>();

        String original = br.readLine();
        for (int i = 0; i < original.length(); i++) {
            bread.add(original.charAt(i));
        }

        ListIterator<Character> iter = bread.listIterator(bread.size());

        for (int i = 0; i < m; i++) {

            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if (cmd.equals("L")) {
                if (iter.hasPrevious()) {
                    iter.previous();
                }

            } else if (cmd.equals("R")) {
                if (iter.hasNext()) {
                    iter.next();
                }

            } else if (cmd.equals("D")) {
                iter.next();
                iter.remove();

            } else if (cmd.equals("P")) {
                char alphabet = st.nextToken().charAt(0);

                iter.add(alphabet);

            }
        }

        iter = bread.listIterator();
        while (iter.hasNext()) {
            bw.write(iter.next());
        }

        bw.flush();
        bw.close();
        br.close();

    }
}