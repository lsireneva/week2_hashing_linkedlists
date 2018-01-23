import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        //B=target
        int n = A.size();
        HashMap<Integer, Integer> elements = new HashMap<>();
        ArrayList<Integer> sum = new ArrayList<>();

        for (int i=0; i<n; i++) {
            int current_number = A.get(i);
            int pair = B - current_number;
            if (!elements.containsKey(pair) && !elements.containsKey(current_number)) {
                elements.put(current_number, i);
            } else if (elements.containsKey(pair)){
                sum.add(1 + elements.get(pair));
                sum.add(i + 1);
                return sum;
            }


        }

        return sum;
    }
}
