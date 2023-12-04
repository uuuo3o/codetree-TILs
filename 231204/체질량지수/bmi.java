import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double heightCm = Integer.parseInt(st.nextToken());
        double weight = Integer.parseInt(st.nextToken());

        double heightM = (heightCm / 100);

        int bmi = (int) (weight / Math.pow(heightM, 2));

        System.out.println(bmi);
        if (bmi >= 25) System.out.println("Obesity");

    }
}