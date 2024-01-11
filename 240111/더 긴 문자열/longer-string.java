import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str1 = st.nextToken();
        String str2 = st.nextToken();
        
        if (str1.length() > str2.length()) {
            bw.write(str1 + " " + str1.length());
        } else if (str1.length() == str2.length()) {
            bw.write("same");
        } else {
            bw.write(str2 + " " + str2.length());
        }

        bw.flush();
        bw.close();
        br.close();
    }
}