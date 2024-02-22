import java.io.*;

public class Main {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws Exception {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        print10Stars();
        print10Stars();
        print10Stars();
        print10Stars();
        print10Stars();

        bw.flush();
        bw.close();
//        br.close();
    }

    public static void print10Stars() throws IOException {
        for (int i = 0; i < 10; i++) {
            bw.write("*");
        }
        bw.write("\n");
    }
}