package com.example.jsfspringboot.service;

import com.example.jsfspringboot.model.UserDetails;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.jsfspringboot.repository.DataRepository;

@Service
public class DataServiceImpl {
    @Autowired
    DataRepository dataRepository;

    public void addData(int id, String name){
        UserDetails userDetails=new UserDetails();
        userDetails.setId(id);
        userDetails.setName(name);
        System.out.println("Details before saving"+userDetails.toString());
        userDetails= dataRepository.save(userDetails);
        System.out.println("Details after saving"+userDetails.toString());
    }
    public UserDetails showDataByID(int id){
        UserDetails userDetails=new UserDetails();

        userDetails=dataRepository.findbyUserId(id);
        System.out.println("Details of given id "+id+" is "+userDetails.toString());
        return userDetails;
    }

}
