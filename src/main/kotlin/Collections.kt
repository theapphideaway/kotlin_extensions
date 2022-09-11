class Collections {
    val samples = arrayListOf("One", "Two", "Three")

    //add(), addAll() - Add an element or elements
    fun addElements(){
        samples.add("Four")
        samples.forEach {println(it)}
        samples.addAll(arrayListOf("Five", "Six"))
        samples.forEach { println(it) }
    }
}