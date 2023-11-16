fun main() {
    
    val NL = readln().split(" ")
    val tapeLength = NL[1].toInt()
    
    val tapedSet = HashSet<Int>()
    val sortedList = readln().split(" ").map{it.toInt()}.toList().sorted()
    var tapeCount = 0
    
    sortedList.forEach{ num ->
        if ( !tapedSet.contains(num) ) {
            tapeCount++
            for ( tapeIndex in num until num + tapeLength )
                tapedSet.add(tapeIndex)
        }
    }
    print(tapeCount)
}