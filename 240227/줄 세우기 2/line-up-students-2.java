import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Student[] students = new Student[n];

        int num = 1;
        for (int i = 0; i < students.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            students[i] = new Student(num++, h, w);
        }

        Arrays.sort(students, Comparator.comparing((Student s) -> s.height)
                .thenComparing(Comparator.comparing((Student s) -> s.weight).reversed()));

        for (int i = 0; i < students.length; i++) {
            bw.write(students[i].toString());
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

class Student {

    int number;
    int height;
    int weight;

    public Student(int number, int height, int weight) {
        this.number = number;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return height + " " + weight + " " + number + "\n";
    }
}