package com.example.c36b

fun main() {
    //immutable
//    val age = 10
//    age = 20

    //mutable
//    var name = "sandis"
//
//    name = "ram"

    //in java
//    String name = "sandis"
//
//    var name: String = "sandis"
//    var age: Int = 16
//
//    println("Hello I am " + name +
//            "and I am " + age
//            + " years old")
//
//    println("Hello I am ${name.lowercase()} and I am $age years old")

//    var age = arrayOf(10,20,30)
//
//    age[3] = 50
//
//    println(age[3])

    var male = arrayListOf<String>("ram","shyam")
    var female = ArrayList<Any>()

    female.add("sita")
    female.add(1)
    female.add("gita")
    male.add("hari")
    male.removeAt(0)

    var meaning = mapOf(
        "apple" to "This is fruits",
        "samsung" to "This is mobile device",
        "Nepal" to "This is country"
    )

    println(meaning["apple"])

    //in java
//    for(int i = 0;i<5;i++){
//        println(i)
//    }

    for(i in 0 until 5){
        println(i)
    }


    for(i in 0 .. 5){
        println(i)
    }
}
//in java
//void calculate(int a,int b){
//   int c = a +b;
//    c;
//}
fun calculate2(a :Int, b: Int) : Unit{
    var c : Int = a+b
    println(c)
}

fun calculate(a :Int, b: Int) : Int{
    var c : Int = a+b
    return c
}