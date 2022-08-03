class Wolf {
    var hungry : Int? = null
    var food : String? = "meat"
    fun eat(): String{
       return "The wolf to eating $food "
    }

    fun getWolf(): Wolf {
        return Wolf()
    }
}

