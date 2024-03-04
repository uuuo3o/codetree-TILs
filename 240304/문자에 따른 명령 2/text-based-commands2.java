import java.io.*;
import java.util.*;

public class Main {

    static final int[] dx = new int[]{1, 0, -1, 0};
    static final int[] dy = new int[]{0, -1, 0, 1};
    static int dirNum = 3;
    static int x = 0, y = 0;

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String commandStr = st.nextToken();
        char[] command = commandStr.toCharArray();

        for (int i = 0; i < command.length; i++) {
            rotate(command[i]);
        }

        bw.write(x + " " + y);

        bw.flush();
        bw.close();
        br.close();
    }

    private static void rotate(char rotateDir) {
        if (rotateDir == 'L') {
            dirNum = (dirNum - 1 + 4) % 4;
        } else if (rotateDir == 'R'){
            dirNum = (dirNum + 1) % 4;
        } else {
            x += dx[dirNum];
            y += dy[dirNum];
        }
    }
}