import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        char alphabet = st.nextToken().charAt(0);
        int askii = (int) alphabet;

        if (askii == 97) {
            askii = 123;
        }

        bw.write(((char) askii - 1));

        bw.flush();
        bw.close();
        br.close();
    }
}