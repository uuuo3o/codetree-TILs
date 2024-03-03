import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();

        int position = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String direction = st.nextToken();
            int time = Integer.parseInt(st.nextToken());

            for (int j = 0; j < time; j++) {
                if (direction.equals("L")) {
                    A.add(--position);
                } else {
                    A.add(++position);
                }
            }
        }

        position = 0;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String direction = st.nextToken();
            int time = Integer.parseInt(st.nextToken());

            for (int j = 0; j < time; j++) {
                if (direction.equals("L")) {
                    B.add(--position);
                } else {
                    B.add(++position);
                }
            }
        }
        
        int meetSecond = -1;
        for (int i = 1; i < Math.min(A.size(), B.size()); i++) {
            if (A.get(i).equals(B.get(i))) {
                meetSecond = i + 1;
                break;
            }
        }

        bw.write(meetSecond + "");

        bw.flush();
        bw.close();
        br.close();
    }
}