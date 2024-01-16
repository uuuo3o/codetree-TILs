import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = br.readLine().trim();
        int num = Integer.parseInt(br.readLine());

        if (num > str.length()) {
            for (int i = str.length() - 1; i >= 0; i--) {
                bw.write(str.charAt(i));
            }
        } else {
            for (int i = str.length() - 1; i >= (str.length() - num); i--) {
                bw.write(str.charAt(i));
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}