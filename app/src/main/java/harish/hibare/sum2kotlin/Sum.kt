package harish.hibare.sum2kotlin

import java.util.*



    fun main(args: Array<String>) {
        val readme = Scanner(System.`in`)
        println("Enter first Number :")

        val n1: Double
        val n2: Double
        val n3: Double
        n1 = readme.nextDouble()
        println("Enter second Number :")
        n2 = readme.nextDouble()
        n3 = n1 + n2
        println("Total = $n3")
    }
