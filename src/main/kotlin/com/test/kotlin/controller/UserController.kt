package com.test.kotlin.controller

import com.test.kotlin.model.User
import com.test.kotlin.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/user")
class UserController @Autowired constructor(private val userServie:UserService){

    @GetMapping("/test")
    fun testApi(): String {
        return "hello world"
    }

    @GetMapping("/list")
    fun list() : List<User>{
        return userServie.list()
    }

}

