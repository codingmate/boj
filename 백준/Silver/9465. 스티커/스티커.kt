fun main(){
    val T = readln().toInt()
    repeat(T) {
        val N = readln().toInt()
        val topNumList = readln().split(" ").map{ it.toInt() }.toList()
        val downNumList = readln().split(" ").map{ it.toInt() }.toList()
        
        val topDp = IntArray(N)
        val downDp = IntArray(N)
        
        topDp[0] = topNumList[0]
        downDp[0] = downNumList[0]
        if (N == 1)
            println(maxOf(topDp[0], downDp[0]))
        else {
            topDp[1] = downDp[0] + topNumList[1]
            downDp[1] = topDp[0] + downNumList[1]
        
            for ( i in 2 until N ) {
                topDp[i] = topNumList[i] + maxOf(downDp[i-1], downDp[i-2])
                downDp[i] = downNumList[i] + maxOf(topDp[i-1], topDp[i-2])
            }
            println(maxOf(topDp[N-1], downDp[N-1]))
        }        
    }
}