package leetcode.algorithm.one

/**
 * 704. Binary Search
 */
fun main() {
//    println(searchFor(intArrayOf(-1, 0, 3, 5, 9, 12), 9))
    println(searchBS(intArrayOf(-1, 0, 3, 5, 9, 12), 9))
}

/**
 * 빠르긴한데 바이너리 서치가 아니다. 바이너리 서치로 풀어보자
 * Runtime: 236 ms, faster than 83.94% of Kotlin online submissions for Binary Search.
 * Memory Usage: 37.9 MB, less than 77.25% of Kotlin online submissions for Binary Search.
 */
private fun searchFor(nums: IntArray, target: Int): Int {
    var result = -1
    for (i in 0 until nums.size) {
        if (nums[i] == target) result = i
    }
    return result
}

/**
 * 오히려 더빠르다 대단하다 이진탐색
 * Runtime: 232 ms, faster than 90.39% of Kotlin online submissions for Binary Search.
 * Memory Usage: 38.3 MB, less than 64.36% of Kotlin online submissions for Binary Search.
 */
private fun searchBS(nums: IntArray, target: Int): Int {
    var start = 0
    var end = nums.size - 1
    while (start <= end) {
        var mid = (start + end) / 2
        if (nums[mid] == target) return mid
        else if (nums[mid] > target) end = mid - 1
        else start = mid + 1
    }
    return -1
}