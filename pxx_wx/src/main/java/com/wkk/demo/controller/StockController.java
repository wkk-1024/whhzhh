package com.wkk.demo.controller;

import com.wkk.demo.comm.Page;
import com.wkk.demo.entity.Stock;
import com.wkk.demo.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class StockController {

    @Autowired
    private StockService service;

    /***
     * 查询商品表中信息
     * @param pageid
     * @return
     */
    @RequestMapping("/querkuncun/{page}")
    public ModelAndView getGoodsByPage(@PathVariable("page") Integer pageid) {
        Page<Stock> page = new Page<>();
        ModelAndView modelAndView = new ModelAndView();
        if (null != pageid || pageid.intValue() != 0) {
            page.setCurenPage(pageid);
        }
        page = service.queryAll(page);
        modelAndView.addObject("page", page);

        modelAndView.setViewName("kuncun");
        return modelAndView;
    }

    /***
     * 上架商品
     */
    @RequestMapping("sjtz")
    public ModelAndView sjtz(HttpServletRequest req,Stock stock){
        String method = req.getParameter("method");
        stock = service.getOne(method);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("stock",stock);

        modelAndView.setViewName("shangjia");

        return modelAndView;

    }
    @RequestMapping("/shangjia")
    public String update_Stock(Stock stock){

        int flag = service.update_Stock(stock);

        int flag1 = service.update_Goods_Added(stock);
        return "forward:querkuncun/1";
    }

    /***
     * 下架商品
     * @param stock
     * @return
     */

    @RequestMapping("/xiajia")
    public String update_Stock1(HttpServletRequest req,Stock stock){
        String method = req.getParameter("method");

        stock = service.getOne(method);
        System.out.println(stock);
        int flag = service.update_Stock1(stock);
        System.out.println(flag);
        int flag1 = service.update_Goods_Added1(stock);
        System.out.println(flag1);
        return "forward:querkuncun/1";
    }
}
