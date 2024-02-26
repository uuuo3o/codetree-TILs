import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
        Student[] students = new Student[5];

        for (int i = 0; i < students.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            double weight = Double.parseDouble(st.nextToken());

            students[i] = new Student(name, height, weight);
        }

        bw.write("name\n");
        Arrays.sort(students, Comparator.comparing(s -> s.name));
        for (Student student : students) {
            bw.write(student.toString());
        }

        bw.write("\nheight\n");
        Arrays.sort(students, Comparator.comparing((Student s) -> s.height).reversed());
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
    double weight;


    public Student(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " " + height + " " + weight + " " + "\n";
    }
}