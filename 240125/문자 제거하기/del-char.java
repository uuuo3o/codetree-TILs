import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = br.readLine();

        int length = str.length();
        while (length != 1) {
            int rmvIdx = Integer.parseInt(br.readLine());

            if (rmvIdx == 0) {
                str = str.substring(1);
            } else if (rmvIdx > length) {
                str = str.substring(0, length - 1);
            } else {
                str = str.substring(0, rmvIdx) + str.substring(rmvIdx + 1);
            }
            
            length = str.length();
            bw.write(str + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}