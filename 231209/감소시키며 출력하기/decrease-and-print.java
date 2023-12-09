import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 17; i > 4; i--) {
            bw.write(i + " ");
        }

        bw.flush();
        bw.close();
    }
}