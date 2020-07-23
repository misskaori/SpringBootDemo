package com.example.demo.Controller;

import com.example.demo.Model.TestModel;
import com.example.demo.Service.MySQLTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Scope("prototype")
@RequestMapping("/mysql/test")
public class MySQLTestController {

    @Autowired
    private MySQLTestService mySQLTestService;

    @RequestMapping(value = "/select")
    public List<TestModel> select() throws Exception {
        return mySQLTestService.select();
    }

    @RequestMapping(path = "/insert")
    public int insert(@RequestParam(value = "name") String name) throws Exception {
        return mySQLTestService.insert(name);
    }

    @RequestMapping(path = "/haha")
    public String haha(){
        return "xixi";
    }
}
