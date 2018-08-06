package com.tsdw.gms.controller

import com.tsdw.gms.bean.User
import com.tsdw.gms.dao.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/account")
class AccountController {

    @Autowired
    lateinit var userRepository: UserRepository

    @RequestMapping("/login")
    fun login(): Any {
        val userList = userRepository.findByMobile("13681036918")
        return "login"
    }
}