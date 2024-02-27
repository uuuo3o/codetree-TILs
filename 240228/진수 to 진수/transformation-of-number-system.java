import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());

        bw.write(convertBase(convertDecimal(n, a), b));

        bw.flush();
        bw.close();
        br.close();
    }

    private static int convertDecimal(int number, int base) {
        int result = 0;
        int multi = 1;

        while (true) {
            if (number <= 1) {
                result += number * multi;
                break;
            }

            result += ((number % 10) * multi);
            number /= 10;
            multi *= base;
        }

        return result;
    }

    private static String convertBase(int decimalNumber, int base) {
        StringBuilder result = new StringBuilder();

        while (true) {
            if (decimalNumber < base) {
                result.insert(0, decimalNumber);
                break;
            }

            result.insert(0, decimalNumber % base);
            decimalNumber /= base;
        }

        return result.toString();
    }
}