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

        arr = bubbleSort(arr);
        for (int i = 0; i < n; i++) {
            bw.write(arr[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();

    }

    private static int[] bubbleSort(int[] arr) {

        int length = arr.length;

        int[] sortedArr = Arrays.copyOf(arr, length);

        boolean sorted = false;
        while (!sorted) {
            for (int i = 0; i < length - 1; i++) {

                sorted = true;

                if (sortedArr[i] > sortedArr[i + 1]) {
                    int temp = sortedArr[i];
                    sortedArr[i] = sortedArr[i + 1];
                    sortedArr[i + 1] = temp;

                    sorted = false;
                }
            }

            if (sorted) {
                for (int i = 0; i < length - 1; i++) {

                    if (sortedArr[i] > sortedArr[i + 1]) {
                        sorted = false;
                        break;
                    }
                }
            }
        }

        return sortedArr;
    }
}