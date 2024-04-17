import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] blocks = new int[n];

        int sum = 0;
        for (int i = 0; i < blocks.length; i++) {
            blocks[i] = Integer.parseInt(br.readLine());
            sum += blocks[i];
        }

        int avg = sum / n;  // 맞춰야할 개수

        int result = 0;
        for (int i = 0; i < blocks.length; i++) {
            if (blocks[i] > avg) {
                result += (blocks[i] - avg);
            }
        }

        bw.write(result + "");
        
        bw.flush();
        bw.close();
        br.close();
    }
}