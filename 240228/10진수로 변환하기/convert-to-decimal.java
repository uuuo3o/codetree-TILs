import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String binaryStr = st.nextToken();

        bw.write(binaryToDecimal(makeBinaryArr(binaryStr)) + "");

        bw.flush();
        bw.close();
        br.close();
    }

    private static int[] makeBinaryArr(String str) {
        char[] charArr = str.toCharArray();
        int[] binary = new int[charArr.length];

        for (int i = 0; i < binary.length; i++) {
            binary[i] = (int) charArr[i] - '0';
        }

        return binary;
    }

    private static int binaryToDecimal(int[] binary) {
        int decimal = binary[0];

        for (int i = 1; i < binary.length; i++) {
            decimal = decimal * 2 + binary[i];
        }

        return decimal;
    }
}