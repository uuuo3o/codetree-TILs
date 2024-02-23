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

        modifyValue(a, b);

        bw.write(a.value + " " + b.value);

        bw.flush();
        bw.close();
        br.close();
    }

    private static void modifyValue(IntValue val1, IntValue val2) {
        if (val1.value <= val2.value) {
            val1.value *= 2;
            val2.value += 25;
        } else {
            val2.value *= 2;
            val1.value += 25;
        }
    }
}

class IntValue {
    int value;

    public IntValue(int value) {
        this.value = value;
    }
}