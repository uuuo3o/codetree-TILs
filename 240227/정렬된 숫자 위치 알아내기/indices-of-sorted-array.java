import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        Array[] arrays = new Array[n];
        int[] originArr = new int[n];

        int idx = 1;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arrays.length; i++) {
            int num = Integer.parseInt(st.nextToken());
            arrays[i] = new Array(idx++, num);
            originArr[i] = num;
        }

        Arrays.sort(arrays, Comparator.comparing(a -> a.num));

        int i = 0;
        while (i < arrays.length) {

            for (int j = 0; j < arrays.length; j++) {
                if (originArr[i] == arrays[j].num) {
                    bw.write((j + 1) + " ");
                    arrays[j].num = 0;
                    i++;
                    break;
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

}

class Array {
    int index;
    int num;

    public Array(int index, int num) {
        this.index = index;
        this.num = num;
    }

    @Override
    public String toString() {
        return index + " ";
    }
}