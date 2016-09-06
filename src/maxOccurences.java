import java.util.*;

/**
 * Created by Jakob on 02-09-2016.
 */
public class maxOccurences{

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 4, 5, 5));

        System.out.println(maxOccurence(list));
    }

    public static int maxOccurence(List<Integer> list) {

        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {

            int num = list.get(i);

            if (m.containsKey(num)) {
                int wordCount = m.get(num);
                m.put(num, wordCount + 1);
            }

            else {
                m.put(num, 1);
            }

        }
        List<Integer> sortedlist = new ArrayList<>(m.values());

        Collections.sort(sortedlist);
        Collections.reverse(sortedlist);

        return sortedlist.get(0);
    }
}


