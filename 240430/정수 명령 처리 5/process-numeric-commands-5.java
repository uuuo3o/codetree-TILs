import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());    // 명령의 수

        ArrayList<Integer> newArrList = new ArrayList<>();

        for (int i = 0; i < N; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            String cmd = st.nextToken();
            int k;

            if (cmd.equals("push_back")) {
                k = Integer.parseInt(st.nextToken());

                // 맨 뒤에 정수 넣기
                newArrList.add(k);

            } else if (cmd.equals("pop_back")) {
                // 맨 뒤 정수 삭제
                newArrList.remove(newArrList.size() - 1);

            } else if (cmd.equals("size")) {
                // 동적 배열에 들어있는 정수의 개수 출력
                bw.write(newArrList.size() + "\n");

            } else if (cmd.equals("get")) {
                k = Integer.parseInt(st.nextToken());

                // (k - 1)번째 숫자 출력
                bw.write(newArrList.get(k - 1) + "\n");

            }

        }

        bw.flush();
        bw.close();
        br.close();

    }
}