package com.tsdw.gms.dao

import com.tsdw.gms.bean.Goods
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.domain.Specification
import org.springframework.data.jpa.repository.JpaRepository

interface GoodsRepository: JpaRepository<Goods, Long> {
    fun findAll(spec: Specification<Goods>, pageable: Pageable): Page<Goods>
}