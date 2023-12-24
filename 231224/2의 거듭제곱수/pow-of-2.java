import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int i = 1;
        while (i <= (n / 2)) {

            if (Math.pow(2, i) == n) {
                break;
            }

            i++;
        }

        bw.write(i + "");

        bw.flush();
        bw.close();
        br.close();
    }
}