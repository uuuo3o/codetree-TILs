import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String name = st.nextToken();
        int code = Integer.parseInt(st.nextToken());

        Goods goods1 = new Goods();
        Goods goods2 = new Goods(name, code);

        bw.write(goods1.toString());
        bw.write(goods2.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}

class Goods {

    String name;
    int code;

    public Goods() {
        this.name = "codetree";
        this.code = 50;
    }

    public Goods(String name, int code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public String toString() {
        return "product " + code + " is " + name + "\n";
    }
}