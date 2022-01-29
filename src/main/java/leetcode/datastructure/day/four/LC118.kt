package leetcode.datastructure.day.four

/**
 * 118. Pascal's Triangle
 */
fun main() {
    println(generate(1))
}

/**
 * 음.. 다른 방법은???
 * Runtime: 264 ms, faster than 19.93% of Kotlin online submissions for Pascal's Triangle.
 * Memory Usage: 34.1 MB, less than 86.23% of Kotlin online submissions for Pascal's Triangle.
 */
fun generate(numRows: Int): List<List<Int>> {
    var result = mutableListOf<MutableList<Int>>()
    for (i in 0 until numRows) {
        var list = mutableListOf<Int>()
        for (j in 0 until i + 1) {
            if (j == 0 || j == i) {
                list.add(1)
            } else {
                val value = result.get(i - 1)
                list.add(value.get(j) + value.get(j - 1))
            }
        }
        result.add(list)
    }
    return result
}