package leetcode.datastructure.day.six

fun main() {
    println(isAnagram("a", "ab"))
}

/**
 * 나쁘지 않군. 즐설 O(nlogn)
 * Runtime: 361 ms, faster than 28.67% of Kotlin online submissions for Valid Anagram.
 * Memory Usage: 41.4 MB, less than 29.32% of Kotlin online submissions for Valid Anagram.
 */
fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length ) return false
    var sArray = s.chars().sorted().toArray()
    var tArray = t.chars().sorted().toArray()
    var result = true
    for (i in 0 until sArray.size) {
        if (sArray[i] != tArray[i]) {
            result = false
        }
    }
    return result
}