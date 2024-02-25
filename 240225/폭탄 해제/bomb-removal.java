import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String code = st.nextToken();
        char color = st.nextToken().charAt(0);
        int second = Integer.parseInt(st.nextToken());

        Bomb bomb = new Bomb(code, color, second);
        bw.write(bomb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}

class Bomb {

    String code;
    char color;
    int second;

    public Bomb(String code, char color, int second) {
        this.code = code;
        this.color = color;
        this.second = second;
    }

    @Override
    public String toString() {
        return "code : " + code + "\n" +
                "color : " + color + "\n" +
                "second : " + second + "\n";
    }
}