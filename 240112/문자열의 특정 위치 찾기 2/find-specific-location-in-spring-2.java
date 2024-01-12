import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char c = br.readLine().charAt(0);
        
        String[] strArr = {"apple", "banana", "grape", "blueberry", "orange"};

        int cnt = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (c == strArr[i].charAt(2) || c == strArr[i].charAt(3)) {
                bw.write(strArr[i] + "\n");
                cnt++;
            }
        }
        bw.write(cnt + "");
        
        bw.flush();
        bw.close();
        br.close();
    }
}