import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        int maxValue = -1;
        int length = 0;
        boolean condition = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int num1 = array[i];
                int num2 = array[j];

                length = String.valueOf(Math.max(array[i], array[j])).length();

                for (int k = 0; k < length; k++) {
                    if ((num1 % 10) + (num2 % 10) >= 10) {
                        condition = false;
                        break;
                    }
                    else {
                        num1 /= 10;
                        num2 /= 10;
                        condition = true;
                    }
                }

                if (condition) {
                    for (int k = j + 1; k < n; k++) {
                        int sum = array[i] + array[j];
                        int num3 = array[k];

                        length = String.valueOf(Math.max(array[i] + array[j], array[k])).length();


                        for (int l = 0; l < length; l++) {
                            if ((sum % 10) + (num3 % 10) >= 10) {
                                condition = false;
                                break;
                            }
                            else {
                                sum /= 10;
                                num3 /= 10;
                                condition = true;
                            }
                        }

                        if (condition) {
                            int totalSum = array[i] + array[j] + array[k];
                            maxValue = Math.max(totalSum, maxValue);
                        }
                    }


                }
            }
        }

        bw.write(maxValue + "");

        bw.flush();
        bw.close();
        br.close();
    }
}