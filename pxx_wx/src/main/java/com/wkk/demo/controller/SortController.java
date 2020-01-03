package com.wkk.demo.controller;

import com.wkk.demo.comm.Page;
import com.wkk.demo.entity.Sort;
import com.wkk.demo.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SortController {

    @Autowired
    private SortService service;

    @RequestMapping("/zhonglei/{page}")
    public ModelAndView getGoodsByPage(@PathVariable("page") Integer pageid){
        Page<Sort> page = new Page<>();
        ModelAndView modelAndView = new ModelAndView();
        if (null !=pageid||pageid.intValue()!= 0){
            page.setCurenPage(pageid);
        }
        page = service.queryAll(page);
        modelAndView.addObject("page",page);

        modelAndView.setViewName("zhonglei");
        return modelAndView;
    }

    /***
     * 添加种类
     */
    @RequestMapping("/tjtz")
    public ModelAndView add_Sort(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("zl_tj");
        return modelAndView;
    }

    @RequestMapping("/zltj1")
    public String add_Sort1(Sort sort){
        int flag = service.add_Sort(sort);
        return "forward:zhonglei/1";
    }
}
