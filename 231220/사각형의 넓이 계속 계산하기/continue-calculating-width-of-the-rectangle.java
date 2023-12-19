import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while (true) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);
            
            bw.write((h * w) + "\n");
            
            if (c == 'C') {
                break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}