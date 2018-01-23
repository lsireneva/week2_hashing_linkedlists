import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("cat");
        list.add("dog");
        list.add("god");
        list.add("tca");

        anagrams(list);


    }

    public static ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        System.out.println(A);
        ArrayList<ArrayList<Integer>> index = new ArrayList<ArrayList<Integer>>();
        HashMap<String, ArrayList<Integer>> integerHashMap = new HashMap<>();


        for (int i=0; i<A.size(); i++) {
            char word[] = A.get(i).toCharArray();
            Arrays.sort(word);
            String sorted = new String(word);

            System.out.println(new String(word));

            if (integerHashMap.containsKey(sorted)) {
                integerHashMap.get(sorted).add(i+1);
            } else {
                ArrayList<Integer> idx = new ArrayList<Integer>();
                idx.add(i+1);
                integerHashMap.put(sorted, idx);
            }



        }
        index.addAll(integerHashMap.values());

        System.out.println(index);

        return index;

    }

}
