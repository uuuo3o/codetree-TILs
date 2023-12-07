import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int a = 0, b = 0, c = 0, d = 0;

        State[] state = new State[3];
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            state[i] = new State(st.nextToken(), Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < 3; i++) {
            if (state[i].coldState.equals("Y")) {
                if (state[i].tempState >= 37) {
                    a++;
                } else {
                    c++;
                }
            } else {
                if (state[i].tempState >= 37) {
                    b++;
                } else {
                    d++;
                }
            }
        }

        if (a >= 2) {
            System.out.println("E");
        } else {
            System.out.println("N");
        }
    }

    public static class State {
        private String coldState;
        private int tempState;

        public State(String coldState, int tempState) {
            this.coldState = coldState;
            this.tempState = tempState;
        }
    }
}