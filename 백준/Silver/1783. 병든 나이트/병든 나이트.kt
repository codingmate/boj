fun main() {
	println(Baekjoon_greedy_s3_1738().solution())
}
class Baekjoon_greedy_s3_1738 {
	fun solution(): Int {

		val NM = readln().split(" ")
		val R = NM[0].toInt()
		val C = NM[1].toInt()
		return if ( R >= 3 && C >= 7 )
			5 + (C - 7)
		else if ( R == 1 )
				1
		else if ( R == 2 ) {
			if ( C <= 2 )
				1
			else if ( C <= 4 )
				2
			else if ( C <= 6 )
				3
			else
				4
		} else //R >= 3
			if ( C <= 3 )
				C
			else
				4
	} // solution
}