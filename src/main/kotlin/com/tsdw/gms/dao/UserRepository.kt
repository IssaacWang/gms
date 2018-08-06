package com.tsdw.gms.dao

import com.tsdw.gms.bean.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {

    fun findByMobile(mobile: String): User
}