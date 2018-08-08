package com.tsdw.gms.controller

import com.tsdw.gms.bean.Goods
import com.tsdw.gms.dao.GoodsRepository
import com.tsdw.gms.service.api.GoodsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.jpa.domain.Specification
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import javax.persistence.criteria.CriteriaQuery
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.criteria.Predicate
import javax.persistence.criteria.Root


@RestController
@RequestMapping("/goods")
class GoodsController {

    @Autowired
    lateinit var goodsService: GoodsService

    @RequestMapping("")
    fun index(req: HttpServletRequest, res: HttpServletResponse) {
        goodsService.findAll()
    }
}