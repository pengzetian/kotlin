package com.test.kotlin.dao

import com.test.java.utils.MyBatisDao
import com.test.kotlin.model.User
import org.springframework.stereotype.Repository

/**
 *
 * Created by Intellij IDEA
 * Author: xionggao
 * Desc:
 * Date: 2017/10/29
 * Email: xionggao@terminus.io
 */
@Repository
open class UserDao: MyBatisDao<User>()