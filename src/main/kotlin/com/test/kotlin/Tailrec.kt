package com.test.kotlin

import java.math.BigInteger

/**
 *
 * Created by Intellij IDEA
 * Author: xionggao
 * Desc:
 * Date: 2017/10/5
 * Email: xionggao@terminus.io
 *
 * 递归
 * 迭代
 */

class Result(var value: BigInteger = BigInteger.valueOf(1L))

tailrec fun count(num:Int, result: Result) {
    if (num == 0) {
        result.value = result.value.times(BigInteger.valueOf(1L))
    }else{
        result.value = result.value.times(BigInteger.valueOf(num.toLong()))
        count(num-1, result);
    }

}

fun main(args: Array<String>) {
    val result = Result()
    count(5, result)
    println(result.value)
}