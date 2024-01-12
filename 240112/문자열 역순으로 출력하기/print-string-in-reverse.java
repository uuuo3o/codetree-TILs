import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strArr = new String[4];
        for (int i = 0; i < 4; i++) {
            strArr[i] = br.readLine();
        }

        for (int i = 3; i >= 0; i--) {
            bw.write(strArr[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}