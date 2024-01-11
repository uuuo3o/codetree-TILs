import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        for (int i = 2; i < 10; i++) {
            bw.write(str.charAt(i) + "");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}