import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        char a = st.nextToken().charAt(0);
        char b = st.nextToken().charAt(0);

        bw.write(((int) a + (int) b) + " " + Math.abs((int) a - (int) b));

        bw.flush();
        bw.close();
        br.close();
    }
}