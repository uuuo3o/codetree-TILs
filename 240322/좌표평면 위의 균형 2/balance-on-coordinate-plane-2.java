import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] inputValue = new int[n][2];

        int maxX = 0, maxY = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            inputValue[i][0] = x;
            inputValue[i][1] = y;

            maxX = Math.max(maxX, x);
            maxY = Math.max(maxY, y);
        }

        int minXDiff = n, xIdx = 0;
        for (int i = 0; i < maxX + 1; i++) {

            int leftCnt = 0, rightCnt = 0;

            for (int j = 0; j < n; j++) {
                if (inputValue[j][0] < i) {
                    leftCnt++;
                } else {
                    rightCnt++;
                }
            }

            if (minXDiff != Math.min(minXDiff, Math.abs(leftCnt - rightCnt))) {
                minXDiff = Math.min(minXDiff, Math.abs(leftCnt - rightCnt));
                xIdx = i;
            }
        }

        int minYDiff = n, yIdx = 0;
        for (int i = 0; i < maxY + 1; i++) {

            int upCnt = 0, downCnt = 0;

            for (int j = 0; j < n; j++) {
                if (inputValue[j][1] < i) {
                    downCnt++;
                } else {
                    upCnt++;
                }
            }

            if (minYDiff != Math.min(minYDiff, Math.abs(upCnt - downCnt))) {
                minYDiff = Math.min(minYDiff, Math.abs(upCnt - downCnt));
                yIdx = i;
            }
        }

        int result = 0;
        int leftDown = 0, leftUp = 0, rightDown = 0, rightUp = 0;

        for (int i = 0; i < n; i++) {
            int x = inputValue[i][0];
            int y = inputValue[i][1];


            if (x < xIdx && y < yIdx) {
                leftDown++;
            } else if (x < xIdx && y > yIdx) {
                leftUp++;
            } else if (x > xIdx && y < yIdx) {
                rightDown++;
            } else if (x > xIdx && y > yIdx) {
                rightUp++;
            }
        }

        int leftMax = Math.max(leftUp, leftDown);
        int rightMax = Math.max(rightUp, rightDown);

        result = Math.max(leftMax, rightMax);

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}