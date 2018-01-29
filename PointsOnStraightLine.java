import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PointsOnStraightLine {

    public static void main (String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        a.add(0);
        a.add(0);
        a.add(1);
        b.add(1);
        b.add(1);
        b.add(1);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(maxPoints(a,b));


    }

    public static int maxPoints(ArrayList<Integer> a, ArrayList<Integer> b) {
        int maxNumberOfPoints=0;
        int n = a.size();
        int x1, y1, x2, y2;
        int val;


        HashMap<Double, Integer> map = new HashMap<Double, Integer>();


        if (a == null || b == null)
            return -1;

        if (a.size() == 0 || b.size()==0)
            return 0;


        for (int i = 0; i < n; i++) {
            x1 = a.get(i);
            y1 = b.get(i);
            map.clear();

            for (int j = 0; j < n; j++) {

                if (i == j)
                    continue;

                x2 = a.get(j);
                y2 = b.get(j);

                double slope = y2 - y1;
                int diff = x2 - x1;

                if (diff == 0)
                    slope = Double.MAX_VALUE;
                else
                    slope = slope / diff;

                val = 1;

                if (map.containsKey(slope)) {
                    val = map.get(slope) + 1;
                }

                map.put(slope, val);

            }

            for (int value : map.values()) {

                maxNumberOfPoints = Math.max(maxNumberOfPoints, value);
            }
        }

        return maxNumberOfPoints+1;
    }
}
