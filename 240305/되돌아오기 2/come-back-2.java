import java.io.*;
import java.util.*;

public class Main {

    // {동, 남, 서, 북} 순서로 dx dy를 정의
    static final int[] dx = new int[]{1, 0, -1, 0};
    static final int[] dy = new int[]{0, -1, 0, 1};


    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String commandStr = br.readLine();
        char[] command = commandStr.toCharArray();
        
        // 시작 좌표 (0, 0) 및 시작 방향 (북쪽)
        int x = 0, y = 0, dirNum = 3;
        
        // 걸리는 시간
        int time = 0;

        // F가 한 번도 안나오면 여전히 제자리이니까,
        // 한 번이라도 움직인 후 0, 0으로 돌아왔을 때의 시간을 구하는 것이므로
        // f가 나온 횟수를 세어줌.
        int fCount = 0;

        // 문제의 조건에 만족하는 경우
        boolean satisfied = false;

        for (int i = 0; i < command.length; i++) {

            if (command[i] == 'F') {
                // F가 주어지면 바라보고 있는 방향으로 한 칸 이동
                x += dx[dirNum];
                y += dy[dirNum];
                fCount++;
            } else if (command[i] == 'L') {
                // 왼쪽으로 90도 방향 회전
                dirNum = (dirNum - 1 + 4) % 4;
            } else {
                // 오른쪽으로 90도 방향 회전
                dirNum = (dirNum + 1) % 4;
            }

            // 모든 경우에 다 1초의 시간이 걸리므로
            time++;
            
            if ((fCount > 0) && (x == 0 && y == 0)) {
                // 처음으로 다시 (0, 0)에 도달하면
                satisfied = true;
                break;
            }
        }

        if (satisfied) {
            bw.write(time + "");
        } else {
            bw.write(-1 + "");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}