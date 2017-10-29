package com.test.kotlin.service

import com.test.kotlin.dao.UserDao
import com.test.kotlin.model.User
import org.springframework.stereotype.Service

/**
 *
 * Created by Intellij IDEA
 * Author: xionggao
 * Desc:
 * Date: 2017/10/29
 * Email: xionggao@terminus.io
 */
@Service
class UserService(private val userDao: UserDao) {


    fun list ():List<User> {
        return userDao.listAll()
    }



}