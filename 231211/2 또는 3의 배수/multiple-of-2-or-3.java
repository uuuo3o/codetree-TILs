import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i < n + 1; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                bw.write(1 + " ");
            } else {
                bw.write(0 + " ");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}