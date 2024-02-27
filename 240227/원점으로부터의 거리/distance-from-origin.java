import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Point[] points = new Point[n];

        int num = 1;
        for (int i = 0; i < points.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            points[i] = new Point(num++, x, y);
        }

        Arrays.sort(points, Comparator.comparing((Point p) ->
                        Math.abs(-p.x) + Math.abs(-p.y))
                .thenComparing((Point p) -> p.num)
        );

        for (Point point : points) {
            bw.write(point.toString());
        }

        bw.flush();
        bw.close();
        br.close();
    }

}

class Point {
    int num;
    int x;
    int y;

    public Point(int num, int x, int y) {
        this.num = num;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return num + "\n";
    }
}