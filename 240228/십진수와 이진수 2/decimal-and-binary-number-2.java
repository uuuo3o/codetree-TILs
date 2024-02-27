import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        bw.write(convertBinary(convertDecimal(n) * 17));

        bw.flush();
        bw.close();
        br.close();
    }

    private static int convertDecimal(int number) {
        int result = 0;
        int multi = 1;

        while (true) {
            if (number <= 1) {
                result += number * multi;
                break;
            }

            result += ((number % 10) * multi);
            number /= 10;
            multi *= 2;
        }

        return result;
    }

    private static String convertBinary(int number) {
        StringBuilder result = new StringBuilder();

        
        while (true) {
            if (number < 2) {
                result.insert(0, number);
                break;
            }

            result.insert(0, number % 2);
            number /= 2;
        }

        return result.toString();
    }
}