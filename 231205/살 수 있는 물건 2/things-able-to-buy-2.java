import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int price = Integer.parseInt(br.readLine());

        if (price >= 3000) {
            System.out.println("book");
        } else if (price >= 1000) {
            System.out.println("mask");
        } else if (price >= 500) {
            System.out.println("pen");
        } else {
            System.out.println("no");
        }
    }
}