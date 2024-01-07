import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numArr = new int[100];
        int i = 0;
        int sum = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreElements()) {
            int n = Integer.parseInt(st.nextToken());
            numArr[i] = n;
            i++;
            
            if (n == 0) {
                for (int j = 0; j < 3; j++) {
                    sum += numArr[i - j - 2];
                }
                
                break;
            }
        }
        
        bw.write(sum + "");

        bw.flush();
        bw.close();
        br.close();
    }
}