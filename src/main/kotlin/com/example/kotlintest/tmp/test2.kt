package com.example.kotlintest.tmp

import kotlin.math.pow

class test2

fun main(args: Array<String>) {

    val arr = listOf(1,2,3,4,5) // accountNos

    val arr2 = listOf(2,3,4,5,6) // accounts

    if(arr2.containsAll(arr)) {

    }
    val mid = arr.filter {
        ele -> !arr2.contains(ele)
    }
    print(mid)

    val res =  mid?.run {
        if (this.isNotEmpty()) print(this) else null
    }

    print(res)

    print(arr.containsAll(arr2))
}
