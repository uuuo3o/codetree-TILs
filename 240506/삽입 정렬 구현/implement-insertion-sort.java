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
        sortedArr = insertionSort(arr);

        for (int i = 0; i < n; i++) {
            bw.write(sortedArr[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();

    }

    private static int[] insertionSort(int[] arr) {

        int length = arr.length;

        for (int i = 1; i < length; i++) {

            int j = i - 1;
            int value = arr[i];
            while (j >= 0 && arr[j] > value) {

                arr[j + 1] = arr[j];
                j--;
                arr[j + 1] = value;
            }
        }

        return arr;
    }
}