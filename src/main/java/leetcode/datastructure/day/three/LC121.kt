package leetcode.datastructure.day.three

/**
 * 121. Best Time to Buy and Sell Stock
 */
fun main(args: Array<String>) {
    println(maxProfit(intArrayOf(2, 1, 2, 1, 0, 1, 2)))
}

/**
 * 가장큰 값만구하면 되기 떄문에 최대 이득을 볼수있는 값을 미리 계산후 다음 min에서 들어오는 놈들의 이익 값을 비교해서 max값을 바꿈
 * 짜증난다
 */
fun maxProfit(prices: IntArray): Int {
    var min = Int.MAX_VALUE
    var max = 0
    for (i in 0 until prices.size) {
        if (prices[i] < min) {
            min = prices[i]
        } else if (prices[i] - min > max) {
            max = prices[i] - min
        }
    }
    return max
}