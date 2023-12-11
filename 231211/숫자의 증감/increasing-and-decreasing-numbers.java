import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        char c = st.nextToken().charAt(0);
        int n = Integer.parseInt(st.nextToken());

        if (c == 'A') {
            for (int i = 1; i < n + 1; i++) {
                bw.write(i + " ");
            }
        } else if (c == 'D') {
            for (int i = n; i > 0; i--) {
                bw.write(i + " ");
            }
        }

        bw.flush();
        bw.close();
    }
}