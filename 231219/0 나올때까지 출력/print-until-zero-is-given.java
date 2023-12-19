import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {

            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            
            bw.write(n + "\n");
        }
        

        bw.write("");

        bw.flush();
        bw.close();
        br.close();
    }
}