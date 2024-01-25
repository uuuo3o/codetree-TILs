import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = br.readLine();
        String B = br.readLine();

        while (A.contains(B)) {

            int j = 0, idx = -1;
            boolean check = false;

            for (int i = 0; i < A.length(); i++) {
                check = false;
                if (A.charAt(i) == B.charAt(j)) {
                    j++;
                    check = true;

                    if (j == B.length()) {
                        idx = i;
                        break;
                    }
                }
            }

            if (check) {
                A = A.substring(0, idx - 1) + A.substring(idx + 1);
            } else {
                break;
            }
        }

        bw.write(A);

        bw.flush();
        bw.close();
        br.close();
    }
}