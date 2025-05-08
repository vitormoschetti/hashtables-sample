import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class Problem1941 {

    //https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/description/?envType=problem-list-v2&envId=hash-table

    public static void main(String[] args) {


    }

    public boolean areOccurrencesEqual(String s) {

        final var map = new HashMap<Character, Integer>();

        for(var ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        final var counters = new HashSet<Integer>();

        for (var ch : map.keySet()) {

            counters.add(map.get(ch));

        }

        return counters.size() == 1;


    }

}
