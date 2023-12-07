import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int mathA = Integer.parseInt(st.nextToken());
        int engA = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int mathB = Integer.parseInt(st.nextToken());
        int engB = Integer.parseInt(st.nextToken());

        if (mathA == mathB) {
            System.out.println(engA > engB ? "A" : "B");
        } else {
            System.out.println(mathA > mathB ? "A" : "B");
        }
    }
}