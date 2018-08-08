package com.tsdw.gms.service.impl

import com.tsdw.gms.bean.Goods
import com.tsdw.gms.dao.GoodsRepository
import com.tsdw.gms.service.api.GoodsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.data.jpa.domain.Specification
import org.springframework.stereotype.Service
import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.criteria.CriteriaQuery
import javax.persistence.criteria.Predicate
import javax.persistence.criteria.Root

@Service
class GoodsServiceImpl: GoodsService {
    @Autowired
    lateinit var goodsRepository: GoodsRepository

    override fun findAll(): List<Goods> {
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
        return goodsList
    }
}