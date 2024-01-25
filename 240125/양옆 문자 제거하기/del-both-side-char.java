import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = br.readLine();
        String newStr = str.charAt(0) + str.substring(3, str.length() - 2) + str.substring(str.length() - 1);

        bw.write(newStr);

        bw.flush();
        bw.close();
        br.close();
    }
}