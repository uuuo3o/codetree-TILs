import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = new int[4];

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0);
            int temp = Integer.parseInt(st.nextToken());

            if (temp >= 37) {
                if (c == 'Y') {
                    array[0]++;
                } else {
                    array[1]++;
                }
            } else {
                if (c == 'Y') {
                    array[2]++;
                } else {
                    array[3]++;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            bw.write(array[i] + " ");
        }

        if (array[0] >= 2) {
            bw.write("E");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}