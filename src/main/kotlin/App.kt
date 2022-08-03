fun main() {
val myWolf : MyWolf? = MyWolf()
    val r1 = Wolf()
    val inputPercent = SetWork()

    val x = myWolf?.wolf?.eat()
    val c =  myWolf?.wolf?.hungry ?: 10
    

    println("animal weight: $c")
    println(x)
    println(r1)

    try {
        inputPercent.setWorkRatePercenTage(-100.0)

    }catch (e: Exception){
        println("Error. Input the diapason 0.0 - 100.0")
    }
}