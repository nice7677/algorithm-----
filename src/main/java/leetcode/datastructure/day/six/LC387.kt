package leetcode.datastructure.day.six

/**
 * LeetCode 387. First Unique Character in a String
 */
fun main(args: Array<String>) {
    println(firstUniqChar("aabb"))
}

/**
 * 밑의 map, keyindexmap을 위에 전역변수로 뺴버리면 속도가 엄청느려진다.
 * 635 ms	67.9 MB 이렇게 메모리도 늘어남
 * 근데 똑같은 변수를 안으로 집어넣으면
 * 308 ms	37.4 MB
 * JVM 변수 메모리 저장방식 때문인가?
 *
 * Runtime: 308 ms, faster than 56.58% of Kotlin online submissions for First Unique Character in a String.
 * Memory Usage: 37.4 MB, less than 58.55% of Kotlin online submissions for First Unique Character in a String.
 */
fun firstUniqChar(s: String): Int {
    var map = mutableMapOf<Char, Int>()
    var keyIndexMap = mutableMapOf<Char, Int>()
    var result = -1
    var i = 0
    for (c in s.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1)
        keyIndexMap.putIfAbsent(c, i)
        i++
    }
    for (key in map.keys) {
        if (map.get(key) == 1) {
            result = keyIndexMap.get(key)!!
            break
        }
    }
    return result
}