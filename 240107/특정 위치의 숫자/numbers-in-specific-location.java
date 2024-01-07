import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] ints = new int[10];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(st.nextToken());
        }
        
        int sum = ints[2] + ints[4] + ints[9];
        bw.write(sum + "");
        
        bw.flush();
        bw.close();
        br.close();
    }
}