import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] sortedArr;
        sortedArr = selectionSort(arr);

        for (int i = 0; i < n; i++) {
            bw.write(sortedArr[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();

    }

    private static int[] selectionSort(int[] arr) {

        int length = arr.length;

        for (int i = 0; i < length; i++) {

            int minIdx = i;

            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

        }

        return arr;
    }
}