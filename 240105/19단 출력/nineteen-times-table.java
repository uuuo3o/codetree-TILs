import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                if (j % 2 == 0 || j == 19) {
                    bw.write(i + " * " + j + " = " + (i * j) + "\n");
                } else {
                    bw.write(i + " * " + j + " = " + (i * j) + " / ");
                }

            }
        }

        bw.flush();
        bw.close();
    }
}