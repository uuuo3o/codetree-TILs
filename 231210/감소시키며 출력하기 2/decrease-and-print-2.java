import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = 26;
        while (i >= 10) {
            bw.write(i + " ");
            i--;
        }

        bw.flush();
        bw.close();
    }
}