package com.tsdw.gms.bean

import javax.persistence.*

@Entity
@Table(name = "user")
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int = -1,

        @Column(nullable = false)
        var username: String = "",

        @Column(nullable = false)
        var password: String = "",

        @Column(nullable = false)
        var mobile: String = ""
)