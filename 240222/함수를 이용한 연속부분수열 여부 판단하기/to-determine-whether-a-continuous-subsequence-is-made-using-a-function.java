import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        int[] A = new int[n1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n1; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int[] B = new int[n2];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n2; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        if (isContinuous(A, B)) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isContinuous(int[] A, int[] B) {

        int indexA = indexOf(A, B[0]);
        int indexB = 1;

        if (indexA == -1) {
            return false;
        }

        for (int i = indexA + 1; i < indexA + B.length; i++) {
            if (A[i] != B[indexB++]) {
                return false;
            }
        }

        return true;
    }

    private static int indexOf(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                return i;
            }
        }
        return -1;
    }
}