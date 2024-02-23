import java.io.*;

public class Main {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(br.readLine());
        recursion(n);

        bw.flush();
        bw.close();
        br.close();
    }

    private static void recursion(int num) throws IOException {
        if (num == 0) return;

        for (int i = 0; i < num; i++) {
            bw.write("* ");
        }
        bw.write("\n");

        recursion(num - 1);
        
        for (int i = 0; i < num; i++) {
            bw.write("* ");
        }
        bw.write("\n");
    }
}