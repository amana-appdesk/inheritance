package com.appdesk.inheritance

open class Parent {

    init {
        println("Parent Construtor is called")
    }
    val name:String = ""
    fun myMethod(){
        println("I am in Parent")
    }
}

class Child : Parent(){

    init {
        println("Child Constructor is called")
    }

    val childName:String = ""

    fun myMethod2(){
        println("I am in Child")
    }

}