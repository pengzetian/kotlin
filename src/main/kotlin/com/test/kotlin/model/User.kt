package com.test.kotlin.model

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

class User(

        var id: Long,

        /**
         * 用户名
         */
        var name: String,

        /**
         * 用户年龄
         */
        var age: Int,

        /**
         *  用户生日
         */
        var birthday: Date


): Serializable

