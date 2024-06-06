fun main() {
    val numRows = 5
    val triangle = generatePascalTriangle(numRows)
    triangle.forEach { println(it) }
}

fun generatePascalTriangle(numRows: Int): List<List<Int>> {
    val triangle = mutableListOf<List<Int>>()

    if (numRows <= 0) {
        return triangle
    }

    val firstRow = mutableListOf(1)
    triangle.add(firstRow)

    for (rowNum in 1 until numRows) {
        val previousRow = triangle[rowNum - 1]
        val currentRow = mutableListOf<Int>()
        currentRow.add(1)

        for (j in 1 until rowNum) {
            currentRow.add(previousRow[j - 1] + previousRow[j])
        }

        currentRow.add(1)
        triangle.add(currentRow)
    }

    return triangle
}
