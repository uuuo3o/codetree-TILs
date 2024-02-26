import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Person[] people = new Person[n];

        for (int i = 0; i < people.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            people[i] = new Person(name, kor, eng, math);
        }

        Arrays.sort(people, (p1, p2) -> {
            int total1 = p1.kor + p1.eng + p1.math;
            int total2 = p2.kor + p2.eng + p2.math;

            return total1 - total2;
        });

        for (Person person : people) {
            bw.write(person.toString());
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

class Person {

    String name;
    int kor;
    int eng;
    int math;

    public Person(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public String toString() {
        return name + " " + kor + " " + eng + " " + math + "\n";
    }
}