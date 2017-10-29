package com.test.kotlin

/**
 *
 * Created by Intellij IDEA
 * Author: xionggao
 * Desc:
 * Date: 2017/9/27
 * Email: xionggao@terminus.io
 *
 * 第一个kotlin 程序 使用maven打包
 */

/**
 *  程序的入口 main
 *
 *  Unit  相对于 void  这里是可以省略的
 */
fun main(args: Array<out String>) : Unit{
    println("hello world")

    println(Student(1, "xionggao"))

    printInfo(args)

    variableParam(args)

    val status = StudentStatus.parseStatus("good");

}

data class Student(val id : Int, val name : String)

/**
 * 定义了一个print 函数
 */
fun printInfo(args: Array<out String>) {

    args.map {
        println(it)
    }

    //上面的写法是 可以写成下面的

    args.map(::println)  // map 遍历 数据 ； 传入方法
}


/**
 * 可变参数
 */
fun variableParam(vararg args: Array<out String>) {
    val param = "a_b_c_d"
    param.flatMap {
        param.split("_")
    }.map{
        println(param)
    }
}

/**
 * 定义枚举类型
 */
enum class StudentStatus(s: String) {

    GOOD("good"),
    BAD("good");

    //定义了一个 静态 的方法
    companion object {
        fun parseStatus(name: String): StudentStatus {
            return StudentStatus.valueOf(name.toLowerCase());
        }
    }

}

/**
 * when 是有返回值的，switch  是没有返回值的
 *
 */
//扩展方法
fun StudentStatus.disable() {

    val status = when(this) {
        StudentStatus.GOOD -> "good"
        StudentStatus.BAD -> "bad"
    }
    println(status)
}