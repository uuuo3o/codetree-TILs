import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int aValue = Integer.parseInt(st.nextToken());
        int bValue = Integer.parseInt(st.nextToken());

        IntValue a = new IntValue(aValue);
        IntValue b = new IntValue(bValue);

        modify(a, b);
        bw.write(a.value + " " + b.value);

        bw.flush();
        bw.close();
        br.close();
    }

    private static void modify(IntValue val1, IntValue val2) {

        if (val1.value <= val2.value) {
            val1.value += 10;
            val2.value *= 2;
        } else {
            val2.value += 10;
            val1.value *= 2;
        }
    }
}

class IntValue {
    int value;

    public IntValue(int value) {
        this.value = value;
    }
}