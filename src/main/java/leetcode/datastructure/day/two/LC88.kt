package leetcode.datastructure.day.two

/**
 * 88. Merge Sorted Array
 */
fun main(args: Array<String>) {
    println(merge(intArrayOf(1, 2, 3, 0, 0, 0), 3, intArrayOf(2, 5, 6), 3))
}

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    /* 첫번째 방법
    * Runtime: 273 ms, faster than 32.47% of Kotlin online submissions for Merge Sorted Array.
    * Memory Usage: 36.6 MB, less than 16.45% of Kotlin online submissions for Merge Sorted Array.
    * 엄청 왕구리진 않았다. 그런데 더빠르게할수있나보다.
    var numList = mutableListOf<Int>()
    for (i in 0 until m) numList.add(nums1[i])
    for (i in 0 until n) numList.add(nums2[i])
    numList.sort()
    for (i in 0 until numList.size) nums1[i] = numList.get(i)
    */
    /* 두번째 방법
     * Runtime: 241 ms, faster than 45.67% of Kotlin online submissions for Merge Sorted Array.
     * Memory Usage: 37.2 MB, less than 12.12% of Kotlin online submissions for Merge Sorted Array.
     * 첫번째보다 조금 빨라졌다. 더 빨리 하는 방법은 무엇일까?*/
    var nums2Int = 0
    for (i in m until nums1.size) {
        nums1[i] = nums2[nums2Int]
        nums2Int++
    }
    nums1.sort()
    /*
    세번째 방법은 merge sorting을 하는것
     */
}

