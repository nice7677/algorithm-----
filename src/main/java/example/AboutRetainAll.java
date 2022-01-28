package example;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class AboutRetainAll {

    public static void main(String[] args) {
        System.out.println(retainAll(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
    }

    public static int[] retainAll(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> nums2Set = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        nums1Set.retainAll(nums2Set);
        return nums1Set.stream().mapToInt(x -> x).toArray();
    }

}
