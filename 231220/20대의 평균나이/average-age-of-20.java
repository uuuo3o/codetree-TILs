import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0, cnt = 0;
        while (true) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());

            if ((age < 20) || (age > 29)) break;

            sum += age;
            cnt++;
        }

        String avg = String.format("%.2f", ((double) sum / cnt));
        bw.write(avg);

        bw.flush();
        bw.close();
        br.close();
    }
}