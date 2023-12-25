import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        boolean condition = false;
        for (int i = 0; i < 5; i++) {
            int n = Integer.parseInt(br.readLine());
            
            if (n % 3 != 0) {
                condition = true;
                break;
            }
        }

        if (condition) {
            bw.write("0");
        } else {
            bw.write("1");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}