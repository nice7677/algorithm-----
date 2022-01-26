package leetcode.datastructure.one

/**
 * 217. Contains Duplicate
 */
fun main(args: Array<String>) {
    println(containsDuplicate(intArrayOf(1, 2, 3, 1)))
}

/**
 * 첫번째 중복제거 방식 runtime, memory => 959 ms, 74.1 MB
 * 두번째 셋으로 중복 체크 방식 runtime, memory => 392 ms, 52.1 MB
 * 이런 문제는 set이 더 좋다.
 */
fun containsDuplicate(nums: IntArray): Boolean {
    /** 중복제거 사이즈 비교 방식
    var distinctListSize = nums.toCollection(ArrayList()).distinct().size
    if (nums.size != distinctListSize) return true
    return false
     */
    // Set으로 중복 찾기
    var numSet = mutableSetOf<Int>()
    for (i in 0 until nums.size) {
        if (numSet.contains(nums[i])) return true
        numSet.add(nums[i])
    }
    return false
}