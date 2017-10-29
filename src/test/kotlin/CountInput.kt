package com.test.kotlin

import javafx.beans.Observable
import java.io.File
import java.util.*

/**
 *
 * Created by Intellij IDEA
 * Author: xionggao
 * Desc:
 * Date: 2017/9/30
 * Email: xionggao@terminus.io
 */

// 读文件
fun main(array: Array<String>){

    val text = File(ClassLoader.getSystemResource("input").path).readText();
    println(text)


}