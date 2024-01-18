import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = br.readLine();

        char one = str.charAt(0);
        char two = str.charAt(1);

        str = str.replace(two, one);
        bw.write(str);

        bw.flush();
        bw.close();
        br.close();
    }
}