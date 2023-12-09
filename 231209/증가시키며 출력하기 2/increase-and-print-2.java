import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = 10;
        while (i <= 26) {
            bw.write(i + " ");

            i++;
        }

        bw.flush();
        bw.close();
    }
}