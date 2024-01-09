import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] array = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        
        char c = st.nextToken().charAt(0);
        
        int idx = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == c) {
                idx = i;
            }
        }
        
        if (idx == -1) {
            bw.write("None");
        } else {
            bw.write(idx + "");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}