import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String t = st.nextToken();

        String[] strArr = new String[n];
        int cnt = 0;
        for (int i = 0; i < strArr.length; i++) {
            boolean condition = true;
            String str = br.readLine();

            for (int j = 0; j < t.length(); j++) {
                if (str.charAt(j) != t.charAt(j)) {
                    condition = false;
                    break;
                }
            }

            if (condition) {
                strArr[i] = str;
                cnt++;
            }
        }

        String[] tStrArr = new String[cnt];
        int idx = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null) {
                tStrArr[idx++] = strArr[i];
            }
        }

        Arrays.sort(tStrArr);
        bw.write(tStrArr[k - 1]);

        bw.flush();
        bw.close();
        br.close();
    }
}