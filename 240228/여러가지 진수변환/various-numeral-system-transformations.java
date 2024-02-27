import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        bw.write(convertBase(n, b) + "");

        bw.flush();
        bw.close();
        br.close();
    }

    private static String convertBase(int number, int base) {
        StringBuilder result = new StringBuilder();

        while (true) {
            if (number < base) {
                result.insert(0, number);
                break;
            }

            result.insert(0, number % base);
            number /= base;
        }

        return result.toString();
    }
}