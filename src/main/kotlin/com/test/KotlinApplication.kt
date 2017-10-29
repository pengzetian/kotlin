package com.test

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.scheduling.annotation.EnableScheduling

/**
 *
 * Created by Intellij IDEA
 * Author: xionggao
 * Desc:
 * Date: 2017/10/29
 * Email: xionggao@terminus.io
 */
@SpringBootApplication
@EnableScheduling
open class KotlinApplication
fun main(vararg args: String) {
    SpringApplication.run(KotlinApplication::class.java, *args)
}