package leetcode.algorithm.one

/**
 * 35. Search Insert Position
 * You must write an algorithm with O(log n) runtime complexity.
 */
fun main() {
//    println(searchInsert(intArrayOf(1, 3, 5, 6), 7))
    println(searchInsertBS(intArrayOf(1, 3, 5, 6), 5))
}

/**
 * 왠일로 빠르게 나왔다 이정도면 만족하지만 문제의 카테고리는 Array와 BS, BS로 다시 풀기
 * Runtime: 184 ms, faster than 60.98% of Kotlin online submissions for Search Insert Position.
 * Memory Usage: 36.9 MB, less than 63.99% of Kotlin online submissions for Search Insert Position.
 */
private fun searchInsert(nums: IntArray, target: Int): Int {
    var result = 0;
    if (nums.contains(target)) {
        for (i in 0 until nums.size) {
            if (nums[i] == target) {
                result = i
                break
            }
        }
    } else {
        for (i in 0 until nums.size) {
            if (nums[i] > target) {
                result = i
                break
            } else {
                result = nums.size
            }
        }
    }
    return result
}

/**
 * 첫번째랑 똑같은데 BS로
 * Runtime: 184 ms, faster than 60.98% of Kotlin online submissions for Search Insert Position.
 * Memory Usage: 36.9 MB, less than 67.25% of Kotlin online submissions for Search Insert Position.
 */
private fun searchInsertBS(nums: IntArray, target: Int): Int {
    var start = 0
    var end = nums.size - 1
    while (start <= end) {
        val mid = start + (end - start) / 2
        if (target == nums[mid]) return mid
        else if (nums[mid] > target) end = mid - 1
        else start = mid + 1
    }
    return start
}