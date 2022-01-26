package leetcode.array.easy

/**
 * 53. Maximum Subarray
 */
fun main(args: Array<String>) {

    println(maxSubArray(intArrayOf(-1, -2)))

}

/**
Runtime: 764 ms
Memory Usage: 77.7 MB
 */
fun maxSubArray(nums: IntArray): Int {
    var max = Int.MIN_VALUE
    var current = 0
    for (i in 0 until nums.size) {
        current = Math.max(nums[i], current + nums[i])
        max = Math.max(max, current)
    }
    return max
}