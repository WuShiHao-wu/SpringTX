package com.baizhi.service;

public class AServiceImpl implements  AService {

    private  BService  bService;

    public void setbService(BService bService) {
        this.bService = bService;
    }

    @Override
    public void modifysave() {
        System.out.println("我是AServiceImpl类中的save方法");
        //嵌套
        bService.find();
    }
}
