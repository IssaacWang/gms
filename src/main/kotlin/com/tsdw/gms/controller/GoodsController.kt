package com.tsdw.gms.controller

import com.tsdw.gms.bean.Goods
import com.tsdw.gms.dao.GoodsRepository
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
    lateinit var goodsRepository: GoodsRepository

    @RequestMapping("")
    fun index(req: HttpServletRequest, res: HttpServletResponse) {
        class mySpec : Specification<Goods> {
            override fun toPredicate(root: Root<Goods>, cq: CriteriaQuery<*>, cb: CriteriaBuilder): Predicate? {
                var predicates: List<Predicate>
                var predicate = cb.and()
                return predicate
            }
        }

        val pageable = PageRequest.of(0,1, Sort(Sort.Direction.DESC, "createTime"))
        val page = goodsRepository.findAll(mySpec(), pageable)
        println("当前第几页:" + (page.number + 1))
        println("当前页总共有几条数据:" + page.numberOfElements)
        println("总共多少条符合条件的数据:" + page.totalElements)
        println("总共多少页:" + page.totalPages)

        val goodsList = goodsRepository.findAll()
    }
}