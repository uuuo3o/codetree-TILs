import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] s = st.nextToken().toCharArray();
        int q = Integer.parseInt(st.nextToken());

        int num, idxA, idxB;
        char charA, charB;

        char[] newS = s;

        for (int i = 0; i < q; i++) {

            st = new StringTokenizer(br.readLine());
            num = Integer.parseInt(st.nextToken());

            if (num == 1) {
                idxA = Integer.parseInt(st.nextToken());
                idxB = Integer.parseInt(st.nextToken());

                idxA--;
                idxB--;

                char first = s[idxA];
                char second = s[idxB];

                newS[idxA] = second;
                newS[idxB] = first;

                bw.write(String.valueOf(newS) + "\n");

            } else {
                charA = st.nextToken().charAt(0);
                charB = st.nextToken().charAt(0);

                for (int j = 0; j < s.length; j++) {
                    if (newS[j] == charA) {
                        newS[j] = charB;
                    }
                }

                bw.write(String.valueOf(newS) + "\n");

            }

            newS = s;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}