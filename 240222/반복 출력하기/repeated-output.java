import java.io.*;

public class Main {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        printNlines(n);

        bw.flush();
        bw.close();
        br.close();
    }

    public static void printNlines(int n) throws IOException {
        for (int i = 0; i < n; i++) {
            bw.write("12345^&*()_");
            bw.write("\n");

        }
    }
}