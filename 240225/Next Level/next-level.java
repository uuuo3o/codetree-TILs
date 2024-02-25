import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String id = st.nextToken();
        int level = Integer.parseInt(st.nextToken());

        character user1 = new character();
        character user2 = new character(id, level);

        bw.write(user1.toString());
        bw.write(user2.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}

class character {

    String id;
    int level;

    public character() {
        this.id = "codetree";
        this.level = 10;
    }

    public character(String id, int level) {
        this.id = id;
        this.level = level;
    }

    @Override
    public String toString() {
        return "user " + id +
                " lv " + level + "\n";
    }
}