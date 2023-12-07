import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int ageA = Integer.parseInt(st.nextToken());
        String genderA = st.nextToken();

        st = new StringTokenizer(br.readLine());
        int ageB = Integer.parseInt(st.nextToken());
        String genderB = st.nextToken();

        if ((ageA >= 19 && genderA.equals("M")) || (ageB >= 19 && genderB.equals("M"))) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}