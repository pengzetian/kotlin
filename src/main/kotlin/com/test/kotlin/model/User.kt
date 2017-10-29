package com.test.kotlin.model

import com.test.kotlin.annotation.Model
import java.io.Serializable
import java.util.*

/**
 *
 * Created by Intellij IDEA
 * Author: xionggao
 * Desc:
 * Date: 2017/10/29
 * Email: xionggao@terminus.io
 */
data class User(

        var id: Long?=null,

        /**
         * 用户名
         */
        var name: String?=null,

        /**
         * 用户年龄
         */
        var age: Int?=null

): Serializable

