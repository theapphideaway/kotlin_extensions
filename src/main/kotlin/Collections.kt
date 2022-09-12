import java.util.Collections

class Collections {
    //BASIC LISTS
    val samples = arrayListOf("One", "Two", "Three")

    //add(), addAll() - Add an element or elements
    fun addElements(){
        samples.add("Four")
        samples.forEach {println(it)}
        samples.addAll(arrayListOf("Five", "Six"))
        samples.forEach { println(it) }
    }

    //contains(), containsAll() - Check whether a collection contains an element or elements
    fun containsElement(){
        val check = samples.contains("One")
        println(check)
        val checkElements = samples.containsAll(arrayListOf("One", "Two"))
        println(checkElements)
    }

    //isEmpty(), isNotEmpty() - Check whether a collection is empty or not
    fun emptyCheck(){
        println(samples.isEmpty())
        println(samples.isNotEmpty())
    }

    //removeIf() - Remove under a certain condition
    fun removeElement(){
        samples.removeIf {it == "One"}
        samples.forEach{println(it)}
    }

    //retainAll() - Leave only selected elements
    fun retainElements(){
        val retainList = arrayListOf("One", "Two")
        samples.retainAll(retainList.toSet())
        samples.forEach { println(it) }
        samples.retainAll { it == "One" }
        samples.forEach { println(it) }
    }

    //clear() - Remove all elements from a list
    fun clearElements(){
        samples.clear()
        println(samples.isEmpty())
    }

    //stream() - gets a stream from a collection
    fun streamElements(){
        val list = samples.stream().filter{it == "One"}
        list.forEach { println(it) }
    }

    //iterator() - Gets an iterator from a collection
    fun iterateElements(){
        val iterator = samples.iterator()
        while (iterator.hasNext()){
            println(iterator.next())
        }
    }

    //indexOf() - Get an index of an element
    fun indexOfElement(){
        println(samples.indexOf("One"))
    }

    //lastIndexOf - Get the last index of an element
    fun lastIndexOfElement(){
        samples.add("One")
        println(samples.lastIndexOf("One"))
    }

    //get() - Get an Element
    fun getElement(){
        println(samples.get(0))
        println(samples[0])
    }

    //sublist - Take a sublist
    fun sublistElements(){
        val sublist = samples.subList(0,1)
        sublist.forEach { println(it) }
    }

    //set(), replaceAll() - Replace an element or elements
    fun replaceElement(){
        samples.set(0, "First Replaced")
        samples[1] = "Second Replaced"
        Collections.replaceAll(samples, "Three", "Replaced")
    }

    //zip() - Create a new list of pairs from two seperate lists
    fun zipElements(){
        val sampleInts = arrayListOf(1,2,3)
        val zipPair = samples zip sampleInts
        println("As A Pair")
        zipPair.forEach { println(it) }
        val map = zipPair.associate { it.first to it.second }
        println("As A Map: ")
        map.forEach { (t, u) -> println("$t, $u") }
    }


    //MAPS
}