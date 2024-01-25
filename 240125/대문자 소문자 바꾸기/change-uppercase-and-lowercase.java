import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = br.readLine();
        
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'A') && str.charAt(i) <= 'Z') {
                bw.write((char) (str.charAt(i) + 32) + "");
            } else if ((str.charAt(i) >= 'a') && str.charAt(i) <= 'z') {
                bw.write((char) (str.charAt(i) - 32) + "");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}