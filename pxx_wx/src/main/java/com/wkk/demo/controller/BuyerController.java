package com.wkk.demo.controller;


import com.wkk.demo.comm.Page;
import com.wkk.demo.entity.Buyer;
import com.wkk.demo.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BuyerController {

    @Autowired
    private BuyerService service;


    @RequestMapping("/caigou/{page}")
    public ModelAndView getGoodsByPage(@PathVariable("page") Integer pageid){
        Page<Buyer> page = new Page<>();
        ModelAndView modelAndView = new ModelAndView();
        if (null !=pageid||pageid.intValue()!= 0){
            page.setCurenPage(pageid);
        }
        page = service.queryAll(page);
        modelAndView.addObject("page",page);

        modelAndView.setViewName("caigou");
        return modelAndView;
    }

    /***
     * 采购、修改进货价与数量
     */
    @RequestMapping("/cgxg")
    public ModelAndView cgxg(HttpServletRequest req,Buyer buyer){

        String method = req.getParameter("method");
        ModelAndView modelAndView = new ModelAndView();
        buyer = service.getOne(method);

        modelAndView.addObject("buyer",buyer);
        modelAndView.setViewName("cg_tj");
        return modelAndView;
    }
    @RequestMapping("/cgxg1")
    public String update_Buyer(Buyer buyer){
        String  a = buyer.getG_code();
        Buyer b = service.getOne(a);
        buyer.setSellcount(b.getSellcount()+buyer.getSellcount());


        int flag = service.update_Buyer(buyer);

        int flag1 = service.update_Stock(buyer);


        return "forward:querkuncun/1";
    }
}
