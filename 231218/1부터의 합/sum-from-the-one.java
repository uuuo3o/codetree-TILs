import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        for (int i = 1; i < 101 + 1; i++) {

            sum += i;

            if (sum >= n) {
                bw.write(i + "");
                break;
            }
        }


        bw.flush();
        bw.close();
        br.close();
    }
}