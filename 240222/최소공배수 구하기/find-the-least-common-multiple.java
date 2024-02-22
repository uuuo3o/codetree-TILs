import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int lcm = calculateLCM(n, m);
        bw.write(lcm + "");

        bw.flush();
        bw.close();
        br.close();
    }

    public static int calculateLCM(int n, int m){

        int i = 2;
        while ((n * i) % m != 0) {
            i++;
        }
        
        return (n * i);
    }
}