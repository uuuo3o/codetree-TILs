import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = br.readLine();

        int len = str.length();
        String newStr = str.substring(0, 1) + 'a' + str.substring(2, len - 2) + 'a' + str.substring(len - 1);

        bw.write(newStr);

        bw.flush();
        bw.close();
        br.close();
    }
}