package com.tsdw.gms.controller

import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@RestController
class IndexController {
    @RequestMapping("")
    fun index() : ModelAndView {
        return ModelAndView("/index.html")
    }
}