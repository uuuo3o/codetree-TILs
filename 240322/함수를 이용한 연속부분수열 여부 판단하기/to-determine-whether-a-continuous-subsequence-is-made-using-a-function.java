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

        if (isContains(A, B)) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isContains(int[] A, int[] B) {

        LinkedList<Integer> listA = new LinkedList<>();
        LinkedList<Integer> listB = new LinkedList<>();
        for (int i : A) {
            listA.add(i);
        }
        for (int i : B) {
            listB.add(i);
        }

        return listA.containsAll(listB);
    }
}