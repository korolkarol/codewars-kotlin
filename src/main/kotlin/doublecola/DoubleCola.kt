package doublecola

fun whoIsNext(names: List<String>, n: Int): String =
    if (n <= names.size) names[n - 1]
    else
        generateSequence(2 to names.size) { prev ->
            prev.first.times(2) to (prev.second + (names.size * prev.first))
        }.takeWhile { it.second < n }.toList().last()
            .let { (n - it.second - 1) / it.first }
            .let { names[it] }