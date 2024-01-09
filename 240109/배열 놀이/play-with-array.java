import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int caseNum = 0, a = 0, b = 0, idx = 0;

        int[] nArray = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nArray[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            caseNum = Integer.parseInt(st.nextToken());

            a = Integer.parseInt(st.nextToken());
            if (caseNum == 3) {
                b = Integer.parseInt(st.nextToken());
            }

            if (caseNum == 1) {
                bw.write(nArray[a - 1] + "\n");
            } else if (caseNum == 2) {
                for (int j = 0; j < n; j++) {
                    if (nArray[j] == a) {
                        idx = j;
                        break;
                    }
                }
                bw.write((idx + 1) + "\n");
            } else {
                for (int j = (a - 1); j < b; j++) {
                    bw.write(nArray[j] + " ");
                }
                bw.write("\n");
            }
        }



        bw.flush();
        bw.close();
        br.close();
    }
}