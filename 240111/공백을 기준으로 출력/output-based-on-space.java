import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        String str2 = br.readLine();

        String str = str1.replace(" ", "") + str2.replace(" ", "");

        bw.write(str);

        bw.flush();
        bw.close();
        br.close();
    }
}