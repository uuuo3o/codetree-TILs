import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {

//        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());
        bw.write(calculate(n) + "");

        bw.flush();
        bw.close();
        br.close();
    }

    public static int calculate(int n){

        int sum = 0;
        for (int i = 1; i < n + 1; i++) {
            sum += i;
        }

        return (sum / 10);
    }
}