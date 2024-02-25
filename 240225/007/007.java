import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String code = st.nextToken();
        char point = st.nextToken().charAt(0);
        int time = Integer.parseInt(st.nextToken());

        SecretPW secretPW = new SecretPW(code, point, time);

        bw.write("secret code : " + secretPW.secrectCode + "\n");
        bw.write("meeting point : " + secretPW.location + "\n");
        bw.write("time : " + secretPW.time);

        bw.flush();
        bw.close();
        br.close();
    }
}

class SecretPW {
    String secrectCode;
    char location;
    int time;

    public SecretPW(String secrectCode, char location, int time) {
        this.secrectCode = secrectCode;
        this.location = location;
        this.time = time;
    }
}