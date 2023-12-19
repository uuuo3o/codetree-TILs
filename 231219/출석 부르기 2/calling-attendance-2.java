import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {

            int n = Integer.parseInt(br.readLine());
            if (n == 1) {
                bw.write("John\n");
            } else if (n == 2) {
                bw.write("Tom\n");
            } else if (n == 3) {
                bw.write("Paul\n");
            } else if (n == 4) {
                bw.write("Sam\n");
            } else {
                bw.write("Vacancy\n");
                break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}