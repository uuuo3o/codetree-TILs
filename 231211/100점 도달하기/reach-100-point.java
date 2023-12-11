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
        for (int i = n; i < 101; i++) {
            if (i >= 90) {
                bw.write("A ");
            } else if (i >= 80) {
                bw.write("B ");
            } else if (i >= 70) {
                bw.write("C ");
            } else if (i >= 60) {
                bw.write("D ");
            } else {
                bw.write("F ");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}