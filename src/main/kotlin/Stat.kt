object Stat {

    fun stat(s: String): String {
        fun String.toSeconds(): Int =
            this.split("|").map { it.toInt() }.let { (it[0] * 3600) + (it[1] * 60) + it[2] }

        fun Int.hhmmss() =
            String.format("%02d|%02d|%02d", this / 3600, (this / 60) % 60, this % 60)

        fun List<Int>.median(): Int =
            if (size % 2 == 0) (this[size / 2] + this[(size - 1) / 2]) / 2 else this[size / 2]

        if (s.isBlank()) return ""
        val durations = s.split(", ").map { it.toSeconds() }.sorted()
        val range = durations.last() - durations.first()
        val average = durations.average().toInt()
        val median = durations.median()

        return "Range: ${range.hhmmss()} Average: ${average.hhmmss()} Median: ${median.hhmmss()}"
    }
}