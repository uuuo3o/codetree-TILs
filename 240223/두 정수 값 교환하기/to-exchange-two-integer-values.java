import java.io.*;
import java.util.*;

class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int nValue = Integer.parseInt(st.nextToken());
        int mValue = Integer.parseInt(st.nextToken());

        IntWrapper n = new IntWrapper(nValue);
        IntWrapper m = new IntWrapper(mValue);

        swap(n, m);
        bw.write(n.value + " " + m.value);

        bw.flush();
        bw.close();
        br.close();
    }

    public static void swap(IntWrapper n, IntWrapper m) {
        int temp = n.value;
        n.value = m.value;
        m.value = temp;
    }
}