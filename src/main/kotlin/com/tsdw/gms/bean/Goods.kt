package com.tsdw.gms.bean

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "goods")
data class Goods(
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int = -1,

        @Column(nullable = false)
        var title: String = "",

        @Column(nullable = false)
        var number: String = "",

        @Column(nullable = false)
        var remark: String = "",

        @Column
        var createtime: Date? = null,

        @Column
        var updatetime: Date? = null
)