import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Info[] infos = new Info[n];
        String [] names = new String[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String address = st.nextToken();
            String city = st.nextToken();

            infos[i] = new Info(name, address, city);
            names[i] = name;
        }

        Arrays.sort(names);

        int idx = -1;
        for (int i = 0; i < infos.length; i++) {
            if (names[names.length - 1].equals(infos[i].name)) {
                idx = i;
            }
        }

        Info lastInfo = infos[idx];

        bw.write(lastInfo.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}

class Info {

    String name;
    String address;
    String city;

    public Info(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;
    }

    @Override
    public String toString() {
        return "name " + name + "\n" +
                "addr " + address + "\n" +
                "city " + city + "\n";
    }
}