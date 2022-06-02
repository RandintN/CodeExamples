import java.io.PrintStream;
import java.util.*;

public class LambdasAndStreams {

    public static int computeClosestToZero(Integer[] ts) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");
        if (ts.length == 0) {
            return 0;
        }
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(ts));
        list.add(0);

        Collections.sort(list);
        return list.get(list.indexOf(0) + 1);
    }

    /* Ignore and do not change the code below */
    // #region main
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] ts = new Integer[n];
        for (int i = 0; i < n; i++) {
            ts[i] = in.nextInt();
        }
        PrintStream outStream = System.out;
        System.setOut(System.err);
        int solution = computeClosestToZero(ts);
        System.setOut(outStream);
        System.out.println(solution);
        in.close();
    }
    // #endregion
}



