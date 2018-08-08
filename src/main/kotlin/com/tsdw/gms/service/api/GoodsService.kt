package com.tsdw.gms.service.api

import com.tsdw.gms.bean.Goods

interface GoodsService {
    fun findAll(): List<Goods>
}