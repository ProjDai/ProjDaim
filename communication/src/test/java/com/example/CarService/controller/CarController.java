 package com.example.CarService.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Car.model.Car;
import com.example.Carservice.service.CarService;

@RefreshScope
@RestController
public class CarController {
   
   @Autowired
   CarService employeeSearchService;

   @RequestMapping("/employee/find/{id}")
   public Car findById(@PathVariable Long id){
      return employeeSearchService.findById(id);
   }
   
   @RequestMapping("/employee/findall")
   public Collection<Car> findAll(){
      return employeeSearchService.findAll();
   }
}