import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = 15;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        boolean condition = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    for (int l = k + 1; l < arr.length; l++) {

                        List<Integer> arrayList = IntStream.of(arr)
                                .boxed()
                                .collect(Collectors.toList());

                         int AB = arr[i] + arr[j];
                         int BC = arr[j] + arr[k];
                         int CD = arr[k] + arr[l];
                         int DA = arr[l] + arr[i];
                         int AC = arr[i] + arr[k];
                         int BD = arr[j] + arr[l];

                         int ABC = arr[i] + arr[j] + arr[k];
                         int ABD = arr[i] + arr[j] + arr[l];
                         int ACD = arr[i] + arr[k] + arr[l];
                         int BCD = arr[j] + arr[k] + arr[l];

                         int ABCD = arr[i] + arr[j] + arr[k] + arr[l];

                        if (arrayList.contains(AB) &&
                                arrayList.contains(BC) &&
                                arrayList.contains(CD) &&
                                arrayList.contains(DA) &&
                                arrayList.contains(AC) &&
                                arrayList.contains(BD) &&
                                arrayList.contains(ABC) &&
                                arrayList.contains(ABD) &&
                                arrayList.contains(ACD) &&
                                arrayList.contains(BCD) &&
                                arrayList.contains(ABCD)
                        ) {
                            bw.write(arr[i] + " " + arr[j] + " " + arr[k] + " " + arr[l]);
                            break;
                        }
                    }
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}