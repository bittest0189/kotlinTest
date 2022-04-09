package com.example.kotlintest

/**
 * @author Youngwoo Kim
 */
class leetTest {

    fun main(args: Array<String>) {
        //    runApplication<KotlinTestApplication>(*args)
//        println("hello world")

        val nums = listOf(2,7,11,15)
        val target = 9

        //로직 구현

        nums.forEachIndexed { index, value ->

            nums.forEachIndexed { index2, value2 ->

                if(index <= index2) {
                    if(value + value2 == target) {

                        println(listOf(index,index2))
                    }
                }
            }
        }

        var ans = listOf<Int>()
        println(ans)
    }
}
