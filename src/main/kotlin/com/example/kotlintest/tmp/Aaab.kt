package com.example.kotlintest.tmp

import kotlin.math.pow

class Aaab

fun main(args: Array<String>) {

    //1. lazy 선언
    val ob : obj by lazy {
        println("this is name by lazy")
        obj("bbbb?")
    }

    //2. lazy 호출
    print("is initialize?")

    println(ob)
}

class obj (
    val tmp:String
) {
    init {
        print("init obj !!!!!!")
    }
}
