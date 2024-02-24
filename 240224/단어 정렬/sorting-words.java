import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(br.readLine());
        String[] strArr = new String[n];

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = br.readLine();
        }
        
        Arrays.sort(strArr);
        for (int i = 0; i < strArr.length; i++) {
            bw.write(strArr[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

}