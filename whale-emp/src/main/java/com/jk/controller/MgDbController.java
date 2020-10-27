package com.jk.controller;


import com.jk.dao.MongoTestDao;
import com.jk.entity.emp.MongoTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MgDbController {

    @Reference
    private MongoTestDao mtdao;

    @GetMapping(value="/test1")
    public void saveTest() throws Exception {
        MongoTest mgtest=new MongoTest();
        mgtest.setId(11);
        mgtest.setAge(33);
        mgtest.setName("ceshi");
        mtdao.saveTest(mgtest);
    }

    @GetMapping(value="/test2")
    public MongoTest findTestByName(){
        MongoTest mgtest= mtdao.findTestByName("ceshi");
        System.out.println("mgtest is "+mgtest);
        return mgtest;
    }

    @GetMapping(value="/test3")
    public void updateTest(){
        MongoTest mgtest=new MongoTest();
        mgtest.setId(11);
        mgtest.setAge(44);
        mgtest.setName("ceshi2");
        mtdao.updateTest(mgtest);
    }

    @GetMapping(value="/test4")
    public void deleteTestById(){
        mtdao.deleteTestById(11);
    }


}