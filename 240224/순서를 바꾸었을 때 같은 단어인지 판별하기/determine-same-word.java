import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        String str1 = br.readLine();
        String str2 = br.readLine();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        boolean condition = true;
        
        if (arr1.length != arr2.length) {
            condition = false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    condition = false;
                    break;
                }
            }
        }
        
        if (condition) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}