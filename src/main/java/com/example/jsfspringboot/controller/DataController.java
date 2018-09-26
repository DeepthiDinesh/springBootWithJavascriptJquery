package com.example.jsfspringboot.controller;

import com.example.jsfspringboot.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.jsfspringboot.service.DataServiceImpl;

@RestController
@RequestMapping(value="/sample")
public class DataController {
    @Autowired
    DataServiceImpl dataService;

    @RequestMapping(value="/adddata", method= RequestMethod.GET)
    public void addData(@RequestParam("id") int id, @RequestParam("name") String name){
        dataService.addData(id,name);

    }

    @RequestMapping(value="/databyid", method=RequestMethod.GET)
    public UserDetails showDataByID(@RequestParam("id") int id){

        return dataService.showDataByID(id);
    }
}
