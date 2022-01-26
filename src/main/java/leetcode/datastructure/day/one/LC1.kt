package leetcode.datastructure.one

fun main(args: Array<String>) {
    println(twoSum(intArrayOf(2, 7, 11, 15), 9))
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    /**
     * 첫번째 방법 O(n^2)
     * Runtime: 628 ms, faster than 5.02% of Kotlin online submissions for Two Sum.
     * Memory Usage: 42.6 MB, less than 21.04% of Kotlin online submissions for Two Sum.
     * 왕구림
     */
    /*var resultArray = IntArray(2)
    for (i in 0 until nums.size) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) {
                resultArray[0] = i
                resultArray[1] = j
            }
        }
        if (resultArray[0] != 0) break
    }
    return resultArray*/

    // ---------------------------------------------------

    /**
     * 두번째 방법 Map 사용하기 O(n)
     * 지나가는 모든 값을 저장후 비교함
     * Runtime: 234 ms, faster than 69.06% of Kotlin online submissions for Two Sum.
     * Memory Usage: 41.4 MB, less than 38.66% of Kotlin online submissions for Two Sum.
     * 훨씬 빠른걸 볼수있음. 굿!
     */
    var resultArray = IntArray(2)
    var numMap = mutableMapOf<Int, Int>()
    for (i in 0 until nums.size) {
        var needValue = target - nums[i]
        if (numMap.containsKey(needValue)) {
            resultArray[0] = numMap.get(needValue)!! // needValue 값이 0번째인 이유는 있다는것 자체가 먼저이기때문
            resultArray[1] = i
            break
        }
        numMap.put(nums[i], i)
    }
    return resultArray
}