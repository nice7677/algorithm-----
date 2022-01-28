package leetcode.bs


/**
 * 349. Intersection of Two Arrays
 */
fun main() {
//    println(intersection(intArrayOf(1,2,2,1), intArrayOf(2,2)))
    println(intersectionUsingRetainAll(intArrayOf(1,2,2,1), intArrayOf(2,2)))
}

// 350번 문제랑 비슷한데 좀다름
/**
 * 첫번째 풀이 속도 메모리 둘다 개구림
 * Runtime: 458 ms, faster than 5.59% of Kotlin online submissions for Intersection of Two Arrays.
 * Memory Usage: 44.5 MB, less than 5.59% of Kotlin online submissions for Intersection of Two Arrays.
 */
private fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
    if (nums1.distinct().size > nums2.distinct().size) intersection(nums2, nums1)
    return nums1.distinct().toIntArray().filter { item -> nums2.contains(item) }.toIntArray()
}

/**
 * retainAll 사용하기
 */
private fun intersectionUsingRetainAll(nums1: IntArray, nums2: IntArray): IntArray {
    nums1.distinct().toMutableList()
    var nums1List = nums1.toMutableSet()
    val nums2List = nums2.toMutableSet()
    nums1List.retainAll(nums2List)
    return nums1List.toIntArray()
}