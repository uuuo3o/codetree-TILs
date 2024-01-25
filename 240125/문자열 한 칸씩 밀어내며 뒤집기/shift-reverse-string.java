import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        int q = Integer.parseInt(st.nextToken());

        for (int i = 0; i < q; i++) {
            int request = Integer.parseInt(br.readLine());

            if (request == 1) {
                A = A.substring(1) + A.charAt(0);
                bw.write(A + "\n");
            } else if (request == 2){
                A = A.substring(A.length() - 1) + A.substring(0, A.length() - 1);
                bw.write(A + "\n");
            } else {
                StringBuilder reversedA = new StringBuilder(A).reverse();
                bw.write(reversedA + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}