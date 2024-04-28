fun main() {
    println(bestsum(7, intArrayOf(5, 3, 4, 7))?.joinToString(", ") ?: "No combination found")
    println(bestsum(300, intArrayOf(7, 14))?.joinToString { "," } ?: "No combination found.")
}


fun bestsum(target: Int, numbers: IntArray): IntArray? {
    if (target == 0) return intArrayOf()
    if (target < 0 || numbers.isEmpty()) return null

    var shortest: IntArray? = null

    numbers.forEach { number ->
        val remainder = target - number
        val combo = bestsum(remainder, numbers)
        if (combo != null) {
            val combination = intArrayOf(*combo, number) // Spread operator (*) to concatenate arrays
            if (shortest == null || combination.size < shortest!!.size) {
                shortest = combination
            }
        }
    }

    return shortest
}
