import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Agent[] agents = new Agent[5];
        int minValue = 100, idx = 0;
        for (int i = 0; i < agents.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char codename = st.nextToken().charAt(0);
            int grade = Integer.parseInt(st.nextToken());

            agents[i] = new Agent(codename, grade);

            if (minValue >= grade) {
                minValue = grade;
                idx = i;
            }
        }

        Agent lowAgent = agents[idx];
        bw.write(lowAgent.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}

class Agent {

    char codename;
    int grade;

    public Agent() {
        this.codename = '0';
        this.grade = 0;
    }

    public Agent(char codename, int level) {
        this.codename = codename;
        this.grade = level;
    }

    @Override
    public String toString() {
        return codename + " " + grade + "\n";
    }
}