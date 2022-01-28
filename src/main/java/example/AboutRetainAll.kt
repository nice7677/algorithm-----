package example

fun main(args: Array<String>) {
    val listExampleIntArrayString =
        listRetainAllExample(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)).map { it.toString() }.toTypedArray()
            .contentToString()
    println("list example int array => " + listExampleIntArrayString)
    val setExampleIntArrayString =
        setRetainAllExample(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)).map { it.toString() }.toTypedArray()
            .contentToString()
    println("set example int array => " + setExampleIntArrayString)
}

// Runtime 461 ms Memory 43.1 MB
fun listRetainAllExample(nums1: IntArray, nums2: IntArray): IntArray {
    val nums1List = nums1.distinct().toMutableList()
    val nums2List = nums2.distinct().toMutableList()
    nums1List.retainAll(nums2List)
    return nums1List.toIntArray()
}

// Runtime 363 ms Memory 42.4 MB
fun setRetainAllExample(nums1: IntArray, nums2: IntArray): IntArray {
    var nums1Set = nums1.toMutableSet()
    val nums2Set = nums2.toMutableSet()
    nums1Set.retainAll(nums2Set)
    return nums1Set.toIntArray()
}