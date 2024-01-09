import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int[] array = new int[n];
        int[] checkArray = new int[1001];
        List<Integer> result = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            array[i] = num;
            checkArray[num]++;
        }

        for (int i = 0; i < n; i++) {
            int num = array[i];
            if (checkArray[num] == 1) {
                result.add(num);
            }
        }

        int maxValue = Integer.MIN_VALUE;

        if (result.isEmpty()) {
            maxValue = -1;
        } else {
            for (int i = 0; i < result.size(); i++) {
                if (maxValue < result.get(i)) {
                    maxValue = result.get(i);
                }
            }
        }

        bw.write(maxValue + "");
        
        bw.flush();
        bw.close();
        br.close();
    }
}