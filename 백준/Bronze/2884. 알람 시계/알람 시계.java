import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        if (M >= 45) {
            System.out.println(H + " " + (M - 45));
        } else {
            if (H == 0) {
                System.out.println(23 + " " + (60 - (45 - M)));
            } else {
                System.out.println((H - 1) + " " + (60 - (45 - M)));
            }
        }
    }
}
