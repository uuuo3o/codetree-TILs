import java.io.*;
import java.util.*;

public class Main {

    static final int[] dx = new int[]{1, 0, -1, 0};
    static final int[] dy = new int[]{0, -1, 0, 1};
    static int dirNum = 3;

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String commandStr = st.nextToken();
        char[] command = commandStr.toCharArray();

        for (int i = 0; i < command.length - 1; i++) {
            rotate(command[i]);
        }

        bw.write(dx[dirNum] + " " + dy[dirNum]);

        bw.flush();
        bw.close();
        br.close();
    }

    private static void rotate(char rotateDir) {
        if (rotateDir == 'L') {
            dirNum = (dirNum - 1 + 4) % 4;
        } else {
            dirNum = (dirNum + 1) % 4;
        }
    }
}