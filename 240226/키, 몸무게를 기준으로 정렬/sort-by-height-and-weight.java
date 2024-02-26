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

        for (int i = 0; i < students.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            students[i] = new Student(name, height, weight);
        }

        Arrays.sort(students, Comparator.comparing((Student s) -> s.height)
                .thenComparing(Comparator.comparing((Student s) -> s.weight).reversed()));
        for (Student student : students) {
            bw.write(student.toString());
        }

        bw.flush();
        bw.close();
        br.close();
    }

}

class Student {

    String name;
    int height;
    int weight;


    public Student(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " " + height + " " + weight + " " + "\n";
    }
}