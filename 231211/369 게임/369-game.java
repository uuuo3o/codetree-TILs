import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i < n + 1; i++) {
            if ((i % 3 == 0) || contains369(i)) {
                bw.write(0 + " ");
            } else {
                bw.write(i + " ");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean contains369(int num) {
        String numbStr = String.valueOf(num);
        for (char digit : numbStr.toCharArray()) {
            if (digit == '3' || digit == '6' || digit == '9') {
                return true;
            }
        }
        return false;
    }
}