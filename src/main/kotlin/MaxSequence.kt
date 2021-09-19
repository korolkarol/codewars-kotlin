import java.lang.Integer.max

fun maxSequence(arr: List<Int>): Int = arr.indexOfFirst { it > 0 }
    .takeIf { it > 0 }
    ?.let { first ->
        (first..arr.indexOfLast { it > 0 })
            .flatMap { i -> (0..i).map { arr.slice(it..i).sum() } }
            .maxOrNull()
    } ?: 0

fun maxSequencePerformant(arr: List<Int>): Int {
    val positiveArr = arr.indexOfFirst { it > 0 }
        .takeIf { it >= 0 }
        ?.let { start ->
            arr.slice(start..arr.indexOfLast { it > 0 })
        } ?: emptyList()
    if (positiveArr.isEmpty()) return 0
    if (positiveArr.size < 3) return positiveArr.sum()

    var maxSum = 0
    var runningSum = 0
    for (i in 0..positiveArr.lastIndex) {
        if (runningSum + positiveArr[i] <= 0) {
            runningSum = 0
        } else {
            runningSum += positiveArr[i]
        }
        maxSum = max(runningSum, maxSum)
    }

    return maxSum
}

fun maxSequenceHighestRated(arr: List<Int>): Int {
    return arr.indices.flatMap { outer ->
        (outer..arr.size).map { inner -> arr.subList(outer, inner).sum() }
    }.maxOrNull() ?: 0
}