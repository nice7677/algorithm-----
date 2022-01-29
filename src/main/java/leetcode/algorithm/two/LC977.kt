package leetcode.algorithm.two

/**
 * 977. Squares of a Sorted Array
 */
fun main() {
    println(sortedSquares(intArrayOf(-4, -1, 0, 3, 10)))
}

/**
 * 쌉구데기 해결방법 다른방법 시도
 * Runtime: 869 ms, faster than 5.57% of Kotlin online submissions for Squares of a Sorted Array.
 * Memory Usage: 75.1 MB, less than 5.14% of Kotlin online submissions for Squares of a Sorted Array.
 */
fun sortedSquares(nums: IntArray): IntArray {
    for (i in 0 until nums.size) nums[i] = nums[i] * nums[i]
    return nums.sortedArray()
}