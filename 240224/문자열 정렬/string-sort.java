import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

//        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);

        for (int i = 0; i < charArr.length; i++) {
            bw.write(charArr[i]);
        }

        bw.flush();
        bw.close();
        br.close();
    }

}