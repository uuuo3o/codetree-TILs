import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();
        
        int AB = Integer.parseInt(A + B);
        int BA = Integer.parseInt(B + A);
        
        bw.write((AB + BA) + "");

        bw.flush();
        bw.close();
        br.close();
    }
}