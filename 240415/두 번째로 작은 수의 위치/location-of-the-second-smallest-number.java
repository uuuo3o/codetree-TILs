import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);

        int minValue = sortedArr[0];
        int secondMinValue = 0;

        for (int i = 1; i < sortedArr.length; i++) {
            if (sortedArr[i] != minValue) {
                secondMinValue = sortedArr[i];
                break;
            }
        }

        int cnt = 0;
        int targetIdx = 0;
        boolean satisfied = false;
        for (int i = 0; i < arr.length; i++) {
            if (secondMinValue == arr[i]) {
                cnt++;
                targetIdx = i + 1;
                satisfied = true;
            }
            if (cnt > 1) {
                satisfied = false;
                break;
            }
        }

        if (satisfied) {
            bw.write(targetIdx + "");
        } else {
            bw.write("-1");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}