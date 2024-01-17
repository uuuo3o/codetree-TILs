import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = br.readLine();
        String target = br.readLine();

        bw.write(str.indexOf(target) + "");

        bw.flush();
        bw.close();
        br.close();
    }
}