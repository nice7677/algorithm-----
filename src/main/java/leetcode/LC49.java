package leetcode;

import java.util.*;

public class LC49 {

    /**
     * Your runtime beats 81.36 % of java submissions.
     * @param strs
     * @return
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> stringMap = new HashMap<>();
        for (String str : strs) {
            char[] stringToChar = str.toCharArray();
            Arrays.sort(stringToChar);
            String sortedString = new String(stringToChar);
            List<String> stringList;
            if (stringMap.containsKey(sortedString)) stringList = stringMap.get(sortedString);
            else stringList = new ArrayList<>();
            stringList.add(str);
            stringMap.put(sortedString, stringList);
        }
        List<List<String>> result = new ArrayList<>();
        for (String key : stringMap.keySet()) {
            result.add(stringMap.get(key));
        }
        return result;
    }

}
