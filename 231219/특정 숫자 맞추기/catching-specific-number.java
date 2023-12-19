import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {

            int n = Integer.parseInt(br.readLine());
            if (n == 25) {
                bw.write("Good\n");
                break;
            } else if (n > 25) {
                bw.write("Lower\n");
            } else {
                bw.write("Higher\n");
            }
        }


        bw.flush();
        bw.close();
        br.close();
    }
}