import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(br.readLine());
        bw.write(recursion(n) + "");

        bw.flush();
        bw.close();
        br.close();
    }

    private static int recursion(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }

        return recursion(num - 1) + recursion(num - 2);
    }
}