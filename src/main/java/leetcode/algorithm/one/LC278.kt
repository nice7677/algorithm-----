package leetcode.algorithm.one

/**
 * 278. First Bad Version
 */
fun main() {
    println(firstBadVersion(2126753390))
}

/**
 * Runtime: 288 ms, faster than 50.17% of Kotlin online submissions for First Bad Version.
 * Memory Usage: 33.5 MB, less than 18.81% of Kotlin online submissions for First Bad Version.
 */
private fun firstBadVersion(n: Int): Int {
    var start = 1
    var end = n
    while (start < end) {
        // end - start / 2에서 start를 한번더 더해줘야 중간값을 찾을수 있음.
        var mid = start + (end - start) / 2
        if (isBadVersion(mid)) {
            end = mid
        } else {
            start = mid + 1
        }
    }
    return start
}

private fun isBadVersion(n: Int): Boolean {
    var badInt = 1702766719
    var result = false
    if (n >= badInt) {
        println("call isBadVersion(" + n + ") -> true")
        result = true
    } else {
        println("call isBadVersion(" + n + ") -> false")
    }
    return result
}