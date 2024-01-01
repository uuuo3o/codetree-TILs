import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = n; i > 0; i--) {
            for (int j = n; j > 0; j--) {
                bw.write("(" + i + "," + j + ") ");
            }
            bw.write("\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}