import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {

//        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());

        printNumSquare(n);

        bw.flush();
        bw.close();
        br.close();
    }

    public static void printNumSquare(int n) throws IOException {
        int cnt = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (cnt > 9) cnt = 1;

                bw.write(cnt++ + " ");
            }
            bw.write("\n");
        }
    }
}