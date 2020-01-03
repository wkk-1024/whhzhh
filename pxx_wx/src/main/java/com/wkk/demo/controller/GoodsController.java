package com.wkk.demo.controller;


import com.wkk.demo.comm.Page;
import com.wkk.demo.entity.Goods;
import com.wkk.demo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class GoodsController {

    @Autowired
    private GoodsService service;

    @RequestMapping("/queryProByPage/{page}")
    public ModelAndView getGoodsByPage(@PathVariable("page") Integer pageid){
        Page<Goods> page = new Page<>();
        ModelAndView modelAndView = new ModelAndView();
        if (null !=pageid||pageid.intValue()!= 0){
            page.setCurenPage(pageid);
        }
        page = service.queryAll(page);
        modelAndView.addObject("page",page);

        modelAndView.setViewName("goods_page");
        return modelAndView;
    }
    //修改查询
    @RequestMapping("/update")
    public ModelAndView update_Goods(HttpServletRequest req,Goods goods){
        String method = req.getParameter("method");
        int id = Integer.valueOf(method);
        ModelAndView modelAndView = new ModelAndView();
        goods = service.getGoodsOne(id);
        modelAndView.addObject("goods",goods);
        modelAndView.setViewName("spxg");
        return modelAndView;

    }
    //修改更新数据库
    @RequestMapping(value = "/update_gx")
    public String update_Goodsgx(Goods goods) {
        int flag = service.update_Goods(goods);
        return "forward:queryProByPage/1";
    }

    /***
     * 添加
     */
    @RequestMapping("/taozhuan")
    public ModelAndView TaoZhuan(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("tinajia");
        return modelAndView;
    }
    @RequestMapping("/add_goods")
    public String add_Goods(@RequestParam("tupian") MultipartFile multipartFile, Goods goods) throws IOException {
        //文件上传

        String sfname = multipartFile.getOriginalFilename().substring(multipartFile.getOriginalFilename().lastIndexOf("."));
        System.out.println(sfname);
        String newName = UUID.randomUUID().toString().replace("-","X");
        File newfile = new File("E:\\images\\imgs\\"+newName+sfname);
        System.out.println("http://localhost:8091/img/"+newName+sfname);
        String a = "http://localhost:8091/img/"+newName+sfname;
        multipartFile.transferTo(newfile);
        goods.setPic_Url(a);

        //执行sql
        //写入Goods
        int flag = service.add_Goods(goods);
        //写入buyer
        int flag1 = service.add1_buyer(goods);
        //写入Stock
        int flag2 = service.add1_Stock(goods);


        return "forward:caigou/1";
    }

    /***
     * 删除
     */
    @RequestMapping("/del_goods")
    public String del_Goods(HttpServletRequest req){
        String method = req.getParameter("method");
        int id = Integer.valueOf(method);
        int flag = service.del_Goods(id);
        return "forward:queryProByPage/1";
    }
}
