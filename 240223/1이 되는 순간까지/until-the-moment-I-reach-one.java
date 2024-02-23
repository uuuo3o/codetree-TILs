import java.io.*;

public class Main {

    static int cnt;

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(br.readLine());
        recursion(n);
        bw.write(cnt + "");

        bw.flush();
        bw.close();
        br.close();
    }

    private static void recursion(int num) {
        if (num == 1) {
            return;
        }

        cnt++;
        if (num % 2 == 0) {
            recursion(num / 2);
        } else {
            recursion(num / 3);
        }
    }
}