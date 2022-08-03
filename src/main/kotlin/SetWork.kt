class SetWork {
    fun setWorkRatePercenTage(percent: Double): Double {
        if (percent !in 0.0..100.0) {
            throw IllegalArgumentException("Percentage not in range 0..100: $percent")
        }
        print("Введенный процент: ")
        return percent

    }













}
