import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();

        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();

        int maxLength = Math.max(len1, (Math.max(len2, len3)));
        int minLength = Math.min(len1, (Math.min(len2, len3)));

        bw.write(maxLength - minLength + "");

        bw.flush();
        bw.close();
        br.close();
    }
}