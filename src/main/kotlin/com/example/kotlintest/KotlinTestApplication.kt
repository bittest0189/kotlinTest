package com.example.kotlintest

import kotlin.math.pow

//@SpringBootApplication
class KotlinTestApplication

fun main(args: Array<String>) {
    //    runApplication<KotlinTestApplication>(*args)
    println("hello world")

    val nodes = ListNode(2)
    nodes.next = ListNode(4)
    nodes!!.next!!.next = ListNode(3)

    val nodes2 = ListNode(5)
    nodes2.next = ListNode(6)
    nodes2!!.next!!.next = ListNode(4)

    addTwoNumbers(nodes , nodes2)
}

fun twoSum(nums: IntArray, target: Int): IntArray {

    nums.forEachIndexed { index, value ->
        nums.forEachIndexed { index2, value2 ->
            if(index < index2) {

                println(" ${value} / ${value2} -> ${value + value2}" )

                println( (value + value2) === target)
                if(value + value2 == target) {
                    println(" return ")
                    return intArrayOf(index,index2)
                }
            }
        }
    }

    return intArrayOf()

}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {

    val num = getNumFromNodes(l1!!)
    val num2 = getNumFromNodes(l2!!)

    println(num)
    println(num2)

//    val sum = num+num2
//    sum
//    val res = ListNode()
//    while()

    return null
}

fun getNumFromNodes(li : ListNode?) : Int{

    //1. 역정렬
    //1.1 list에 담으면서 마지막까지 간 후
    //1.2 list.reverse
    val nodeList  = mutableListOf<Int>()

    var node = li
    while(node != null) {
        nodeList.add(node.`val`)
        node = node.next
    }

    val reveredList = nodeList.reversed()

    println(reveredList)

    var sum = 0
    var digit = 10.0.pow(reveredList.size-1)
    for(ele in reveredList) {
        sum += ele * digit.toInt()
        digit = digit/10
    }

    return sum
}
//class testThread : Runnable {
//
//    override fun run() {
//        println("run!")
//        println(Thread.currentThread())
//    }
//}
