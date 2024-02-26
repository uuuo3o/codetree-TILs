import java.io.*;
import java.util.Arrays;
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

            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            students[i] = new Student(num++, height, weight);
        }

        Arrays.sort(students, (s1, s2) -> {
            if (s1.height == s2.height) {
                if (s1.weight == s2.weight) {
                    return s1.num - s2.num;
                } else {
                    return s2.weight - s1.weight;
                }
            } else {
                return s2.height - s1.height;
            }
        });

        for (Student student : students) {
            bw.write(student.toString());
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

class Student {

    int num;
    int height;
    int weight;


    public Student(int num, int height, int weight) {
        this.num = num;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  height + " " + weight + " " + num + "\n";
    }
}