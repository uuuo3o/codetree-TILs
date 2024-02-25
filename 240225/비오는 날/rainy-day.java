import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Predict[] predicts = new Predict[n];

        int idx = 0;
        for (int i = 0; i < predicts.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String date = st.nextToken();
            String day = st.nextToken();
            String whether = st.nextToken();

            if (whether.equals("Rain")) {
                predicts[idx++] = new Predict(date, day, whether);
            }
        }

        String soonDate = predicts[0].date;
        int predictsIdx = 0;
        for (int i = 1; i < idx; i++) {
            String futureDate = predicts[i].date;

            if (Integer.parseInt(soonDate.split("-")[0]) > Integer.parseInt(futureDate.split("-")[0])) {
                soonDate = futureDate;
                predictsIdx = i;
            } else if (Integer.parseInt(soonDate.split("-")[0]) == Integer.parseInt(futureDate.split("-")[0])) {
                if (Integer.parseInt(soonDate.split("-")[1]) > Integer.parseInt(futureDate.split("-")[1])) {
                    soonDate = futureDate;
                    predictsIdx = i;
                } else if (Integer.parseInt(soonDate.split("-")[1]) == Integer.parseInt(futureDate.split("-")[1])) {
                    if (Integer.parseInt(soonDate.split("-")[2]) > Integer.parseInt(futureDate.split("-")[2])) {
                        soonDate = futureDate;
                        predictsIdx = i;
                    }
                }
            }
        }

        Predict soonPredict = predicts[predictsIdx];

        bw.write(soonPredict.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}

class Predict {

    String date;
    String day;
    String whether;

    public Predict(String date, String day, String whether) {
        this.date = date;
        this.day = day;
        this.whether = whether;
    }

    @Override
    public String toString() {
        return date + " " + day + " " + whether + "\n";
    }
}