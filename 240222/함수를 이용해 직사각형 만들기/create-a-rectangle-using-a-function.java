import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        printNlines(n, m);

        bw.flush();
        bw.close();
        br.close();
    }

    public static void printNlines(int n, int m) throws IOException {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                bw.write("1");
            }
            bw.write("\n");
        }
    }
}