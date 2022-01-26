package leetcode.array.easy

fun main(args: Array<String>) {

    println(findMaxConsecutiveOnes(intArrayOf(1, 1, 0, 1, 1, 1)))

}


/**
 * Runtime: 684 ms, faster than 6.33% of Kotlin online submissions for Max Consecutive Ones.
 * Memory Usage: 69.4 MB, less than 5.06% of Kotlin online submissions for Max Consecutive Ones.
 * 왕구리네;
 *
 */
fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var sumBiggest: Int = 0
    var sum: Int = 0
    for (num in nums) {
        if (num == 0) {
            if (sum > sumBiggest) sumBiggest = sum
            sum = 0
        }
        sum += num
    }
    if (sum > sumBiggest) sumBiggest = sum
    return sumBiggest
}